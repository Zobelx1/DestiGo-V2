package com.mobilebreakero.core_domain.model

import com.google.gson.annotations.SerializedName

data class PhotosResponse(
	@field:SerializedName("data")
	val data: List<com.mobilebreakero.core_domain.model.PhotoDataItem?> = emptyList()
)

data class Small(

	@field:SerializedName("width")
	val width: Int? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("height")
	val height: Int? = null
)

data class User(

	@field:SerializedName("username")
	val username: String? = null
)

data class Thumbnail(

	@field:SerializedName("width")
	val width: Int? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("height")
	val height: Int? = null
)

data class Large(

	@field:SerializedName("width")
	val width: Int? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("height")
	val height: Int? = null
)

data class Source(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("localized_name")
	val localizedName: String? = null
)

data class Images(

    @field:SerializedName("small")
	val small: com.mobilebreakero.core_domain.model.Small? = null,

    @field:SerializedName("thumbnail")
	val thumbnail: com.mobilebreakero.core_domain.model.Thumbnail? = null,

    @field:SerializedName("original")
	val original: com.mobilebreakero.core_domain.model.Original? = null,

    @field:SerializedName("large")
	val large: com.mobilebreakero.core_domain.model.Large? = null,

    @field:SerializedName("medium")
	val medium: com.mobilebreakero.core_domain.model.Medium? = null
)

data class PhotoDataItem(

    @field:SerializedName("images")
	val images: com.mobilebreakero.core_domain.model.Images? = null,

    @field:SerializedName("is_blessed")
	val isBlessed: Boolean? = null,

    @field:SerializedName("album")
	val album: String? = null,

    @field:SerializedName("caption")
	val caption: String? = null,

    @field:SerializedName("id")
	val id: Int? = null,

    @field:SerializedName("source")
	val source: com.mobilebreakero.core_domain.model.Source? = null,

    @field:SerializedName("published_date")
	val publishedDate: String? = null,

    @field:SerializedName("user")
	val user: com.mobilebreakero.core_domain.model.User? = null
)

data class Original(

	@field:SerializedName("width")
	val width: Int? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("height")
	val height: Int? = null
)

data class Medium(

	@field:SerializedName("width")
	val width: Int? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("height")
	val height: Int? = null
)
