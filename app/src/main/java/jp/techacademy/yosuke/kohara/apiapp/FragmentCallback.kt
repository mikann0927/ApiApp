package jp.techacademy.yosuke.kohara.apiapp

interface FragmentCallback {
    // Itemを押したときの処理
    //課題対応
    fun onClickItem(shop: Shop)
    // お気に入り追加時の処理
    fun onAddFavorite(shop: Shop)
    // お気に入り削除時の処理
    fun onDeleteFavorite(id: String)

    // Itemを押したときの処理
    //課題対応
    fun onClickItem2(favoriteshop: FavoriteShop)
}