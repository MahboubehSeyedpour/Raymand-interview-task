package com.example.raymand_interview_task.data

import com.example.raymand_interview_task.data.Exceptions.NoInternetException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.withContext
import okhttp3.ResponseBody
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import retrofit2.HttpException
import retrofit2.Response
import java.io.IOException

abstract class SafeApiRequest {

    fun <T : Any> apiRequestFlow(call: suspend () -> Response<T>): Flow<Resource<T>> {
        return flow {
            emit(Resource.Loading())
            try {
                val response = call()
                if (response.isSuccessful) {
                    emit(Resource.Success(response.body()!!))
                } else {
                    response.errorBody()?.let { errorBody ->

                        val error = errorBody.stringSuspending()
                    }
                }
            } catch (ex: NoInternetException) {
                emit(
                    Resource.Error(
                        message = ex.message!!,
                        status = ""
                    )
                )
            } catch (ex: HttpException) {
                emit(
                    Resource.Error(
                        message = ex.localizedMessage ?: "An unexpected error occurred",
                        status = ""
                    )
                )
            } catch (ex: IOException) {
                emit(
                    Resource.Error(
                        message = "Couldn't reach server. Check your internet connection.",
                        status = ""
                    )
                )
            }!!
        }
    }
}

suspend fun ResponseBody.stringSuspending() =
    withContext(Dispatchers.IO) { string() }

fun isJSONValid(input: String): Boolean {
    try {
        JSONObject(input)
    } catch (ex: JSONException) {
        try {
            JSONArray(input)
        } catch (ex: JSONException) {
            return false
        }
    }
    return true
}