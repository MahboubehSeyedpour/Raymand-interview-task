package com.example.raymand_interview_task.data.response

import com.example.raymand_interview_task.data.model.Akas
import com.example.raymand_interview_task.data.model.AlternateVersions
import com.example.raymand_interview_task.data.model.CanRate
import com.example.raymand_interview_task.data.model.Cast
import com.example.raymand_interview_task.data.model.CastPageTitle
import com.example.raymand_interview_task.data.model.Companies
import com.example.raymand_interview_task.data.model.Connections
import com.example.raymand_interview_task.data.model.ContributionQuestions
import com.example.raymand_interview_task.data.model.CountriesOfOrigin
import com.example.raymand_interview_task.data.model.CrazyCredits
import com.example.raymand_interview_task.data.model.Credits
import com.example.raymand_interview_task.data.model.CriticReviewsTotal
import com.example.raymand_interview_task.data.model.DetailsExternalLinks
import com.example.raymand_interview_task.data.model.DirectorsItem
import com.example.raymand_interview_task.data.model.DirectorsPageTitleItem
import com.example.raymand_interview_task.data.model.ExternalLinks
import com.example.raymand_interview_task.data.model.Faqs
import com.example.raymand_interview_task.data.model.FeaturedReviews
import com.example.raymand_interview_task.data.model.FilmingLocations
import com.example.raymand_interview_task.data.model.Genres
import com.example.raymand_interview_task.data.model.Goofs
import com.example.raymand_interview_task.data.model.GoofsTotal
import com.example.raymand_interview_task.data.model.IframeAddReviewLink
import com.example.raymand_interview_task.data.model.ImageUploadLink
import com.example.raymand_interview_task.data.model.Images
import com.example.raymand_interview_task.data.model.Keywords
import com.example.raymand_interview_task.data.model.Meta
import com.example.raymand_interview_task.data.model.MoreLikeThisTitles
import com.example.raymand_interview_task.data.model.Nominations
import com.example.raymand_interview_task.data.model.OriginalTitleText
import com.example.raymand_interview_task.data.model.Plot
import com.example.raymand_interview_task.data.model.PlotContributionLink
import com.example.raymand_interview_task.data.model.PrimaryImage
import com.example.raymand_interview_task.data.model.PrimaryVideos
import com.example.raymand_interview_task.data.model.PrincipalCreditsItem
import com.example.raymand_interview_task.data.model.Production
import com.example.raymand_interview_task.data.model.ProductionBudget
import com.example.raymand_interview_task.data.model.ProductionStatus
import com.example.raymand_interview_task.data.model.Quotes
import com.example.raymand_interview_task.data.model.QuotesTotal
import com.example.raymand_interview_task.data.model.RatingsSummary
import com.example.raymand_interview_task.data.model.ReleaseDate
import com.example.raymand_interview_task.data.model.ReleaseYear
import com.example.raymand_interview_task.data.model.Reviews
import com.example.raymand_interview_task.data.model.Runtime
import com.example.raymand_interview_task.data.model.Soundtrack
import com.example.raymand_interview_task.data.model.SpokenLanguages
import com.example.raymand_interview_task.data.model.SubNavCredits
import com.example.raymand_interview_task.data.model.SubNavFaqs
import com.example.raymand_interview_task.data.model.SubNavReviews
import com.example.raymand_interview_task.data.model.SubNavTopQuestions
import com.example.raymand_interview_task.data.model.SubNavTrivia
import com.example.raymand_interview_task.data.model.TechnicalSpecifications
import com.example.raymand_interview_task.data.model.TitleGenres
import com.example.raymand_interview_task.data.model.TitleMainImages
import com.example.raymand_interview_task.data.model.TitleText
import com.example.raymand_interview_task.data.model.TitleType
import com.example.raymand_interview_task.data.model.TopQuestions
import com.example.raymand_interview_task.data.model.Trivia
import com.example.raymand_interview_task.data.model.TriviaTotal
import com.example.raymand_interview_task.data.model.VideoStrip
import com.example.raymand_interview_task.data.model.Videos
import com.example.raymand_interview_task.data.model.Wins
import com.example.raymand_interview_task.data.model.WritersItem
import com.google.gson.annotations.SerializedName

data class MovieDetailsResponse(
    @SerializedName("titleType")
    val titleType: TitleType,
    @SerializedName("keywords")
    val keywords: Keywords,
    @SerializedName("featuredReviews")
    val featuredReviews: FeaturedReviews,
    @SerializedName("openingWeekendGross")
    val openingWeekendGross: Any,
    @SerializedName("videos")
    val videos: Videos,
    @SerializedName("iframeAddReviewLink")
    val iframeAddReviewLink: IframeAddReviewLink,
    @SerializedName("quotes")
    val quotes: Quotes,
    @SerializedName("criticReviewsTotal")
    val criticReviewsTotal: CriticReviewsTotal,
    @SerializedName("cast")
    val cast: Cast,
    @SerializedName("companies")
    val companies: Companies,
    @SerializedName("canRate")
    val canRate: CanRate,
    @SerializedName("quotesTotal")
    val quotesTotal: QuotesTotal,
    @SerializedName("reviews")
    val reviews: Reviews,
    @SerializedName("productionStatus")
    val productionStatus: ProductionStatus,
    @SerializedName("titleText")
    val titleText: TitleText,
    @SerializedName("canHaveEpisodes")
    val canHaveEpisodes: Boolean = false,
    @SerializedName("externalLinks")
    val externalLinks: ExternalLinks,
    @SerializedName("id")
    val id: String = "",
    @SerializedName("filmingLocations")
    val filmingLocations: FilmingLocations,
    @SerializedName("meterRanking")
    val meterRanking: Any,
    @SerializedName("episodes")
    val episodes: Any,
    @SerializedName("connections")
    val connections: Connections,
    @SerializedName("worldwideGross")
    val worldwideGross: Any,
    @SerializedName("wins")
    val wins: Wins,
    @SerializedName("soundtrack")
    val soundtrack: Soundtrack,
    @SerializedName("images")
    val images: Images,
    @SerializedName("subNavReviews")
    val subNavReviews: SubNavReviews,
    @SerializedName("ratingsSummary")
    val ratingsSummary: RatingsSummary,
    @SerializedName("primaryImage")
    val primaryImage: PrimaryImage,
    @SerializedName("runtime")
    val runtime: Runtime,
    @SerializedName("subNavTrivia")
    val subNavTrivia: SubNavTrivia,
    @SerializedName("faqs")
    val faqs: Faqs,
    @SerializedName("countriesOfOrigin")
    val countriesOfOrigin: CountriesOfOrigin,
    @SerializedName("videoStrip")
    val videoStrip: VideoStrip,
    @SerializedName("meta")
    val meta: Meta,
    @SerializedName("goofsTotal")
    val goofsTotal: GoofsTotal,
    @SerializedName("crazyCredits")
    val crazyCredits: CrazyCredits,
    @SerializedName("spokenLanguages")
    val spokenLanguages: SpokenLanguages,
    @SerializedName("contributionQuestions")
    val contributionQuestions: ContributionQuestions,
    @SerializedName("subNavFaqs")
    val subNavFaqs: SubNavFaqs,
    @SerializedName("primaryVideos")
    val primaryVideos: PrimaryVideos,
    @SerializedName("production")
    val production: Production,
    @SerializedName("prestigiousAwardSummary")
    val prestigiousAwardSummary: Any,
    @SerializedName("__typename")
    val Typename: String = "",
    @SerializedName("directors")
    val directors: List<DirectorsItem>?,
    @SerializedName("certificate")
    val certificate: Any,
    @SerializedName("metacritic")
    val metacritic: Any,
    @SerializedName("titleGenres")
    val titleGenres: TitleGenres,
    @SerializedName("goofs")
    val goofs: Goofs,
    @SerializedName("subNavTopQuestions")
    val subNavTopQuestions: SubNavTopQuestions,
    @SerializedName("alternateVersions")
    val alternateVersions: AlternateVersions,
    @SerializedName("directorsPageTitle")
    val directorsPageTitle: List<DirectorsPageTitleItem>?,
    @SerializedName("imageUploadLink")
    val imageUploadLink: ImageUploadLink,
    @SerializedName("detailsExternalLinks")
    val detailsExternalLinks: DetailsExternalLinks,
    @SerializedName("technicalSpecifications")
    val technicalSpecifications: TechnicalSpecifications,
    @SerializedName("plot")
    val plot: Plot,
    @SerializedName("credits")
    val credits: Credits,
    @SerializedName("genres")
    val genres: Genres,
    @SerializedName("moreLikeThisTitles")
    val moreLikeThisTitles: MoreLikeThisTitles,
    @SerializedName("releaseYear")
    val releaseYear: ReleaseYear,
    @SerializedName("isAdult")
    val isAdult: Boolean = false,
    @SerializedName("lifetimeGross")
    val lifetimeGross: Any,
    @SerializedName("releaseDate")
    val releaseDate: ReleaseDate,
    @SerializedName("originalTitleText")
    val originalTitleText: OriginalTitleText,
    @SerializedName("engagementStatistics")
    val engagementStatistics: Any,
    @SerializedName("trivia")
    val trivia: Trivia,
    @SerializedName("writers")
    val writers: List<WritersItem>?,
    @SerializedName("nominations")
    val nominations: Nominations,
    @SerializedName("principalCredits")
    val principalCredits: List<PrincipalCreditsItem>?,
    @SerializedName("subNavCredits")
    val subNavCredits: SubNavCredits,
    @SerializedName("plotContributionLink")
    val plotContributionLink: PlotContributionLink,
    @SerializedName("akas")
    val akas: Akas,
    @SerializedName("castPageTitle")
    val castPageTitle: CastPageTitle,
    @SerializedName("titleMainImages")
    val titleMainImages: TitleMainImages,
    @SerializedName("series")
    val series: Any,
    @SerializedName("productionBudget")
    val productionBudget: ProductionBudget,
    @SerializedName("triviaTotal")
    val triviaTotal: TriviaTotal,
    @SerializedName("topQuestions")
    val topQuestions: TopQuestions
)