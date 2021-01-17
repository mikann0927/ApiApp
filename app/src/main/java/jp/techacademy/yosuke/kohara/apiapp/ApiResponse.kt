package jp.techacademy.yosuke.kohara.apiapp

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ApiResponse(
    @SerializedName("results")
    var results: Results
)

data class Results(
    @SerializedName("shop")
    var shop: List<Shop>
)

//課題対応
data class Shop(@SerializedName("coupon_urls") val couponUrls: CouponUrls) : Serializable{
    @SerializedName("id")
    val id: String = ""
    @SerializedName("logo_image")
    val logoImage: String = ""
    @SerializedName("name")
    val name: String = ""
    @SerializedName("address")
    val address: String = ""


data class CouponUrls(
    @SerializedName("pc")
    var pc: String,
    @SerializedName("sp")
    var sp: String)
}

//課題対応
/*
data class shop2(@SerializedName("coupon_urls") val couponUrls: CouponUrls) : Serializable{
    @SerializedName("id")
    val id: String = ""
    @SerializedName("logo_image")
    val logoImage: String = ""
    @SerializedName("name")
    val name: String = ""
    @SerializedName("address")
    var address: String = ""


data class CouponUrls(
    @SerializedName("pc")
    var pc: String,
    @SerializedName("sp")
    var sp: String)
}
*/