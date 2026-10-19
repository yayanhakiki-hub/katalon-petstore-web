# Daftar Test Object (buat manual di Object Repository)

Cara: Spy Web -> arahkan ke elemen -> Add to Object Repository.
Atau klik kanan Object Repository > New > Test Object, isi XPath di bawah.
Nama folder/objek HARUS sama persis dengan yang dipakai script.

| Folder/Nama Object | XPath (verifikasi dgn Spy Web) |
|---|---|
| Home/lnk_SignIn | //a[contains(@href,'signonForm')] |
| Home/lnk_SignOut | //a[contains(@href,'signoff')] |
| Home/txt_Search | //input[@name='keyword'] |
| Home/btn_Search | //input[@name='searchProducts'] |
| Home/lnk_CategoryFish | //div[@id='SidebarContent']//a[contains(@href,'categoryId=FISH')] |
| Home/lnk_CategoryDogs | //div[@id='SidebarContent']//a[contains(@href,'categoryId=DOGS')] |
| Home/lnk_CategoryCats | //div[@id='SidebarContent']//a[contains(@href,'categoryId=CATS')] |
| Login/txt_username | //input[@name='username'] |
| Login/txt_password | //input[@name='password'] |
| Login/btn_Login | //input[@name='signon'] |
| Login/lbl_ErrorMessage | //ul[@class='messages']//li |
| Search/lnk_FirstResult | (//div[@id='Catalog']//table//a[contains(@href,'productId') or contains(@href,'itemId')])[1] |
| Category/lnk_FirstProduct | (//div[@id='Catalog']//table//a[contains(@href,'productId')])[1] |
| Product/lnk_FirstItem | (//div[@id='Catalog']//table//a[contains(@href,'itemId')])[1] |
| Item/btn_AddToCart | //a[contains(text(),'Add to Cart')] |
| Cart/lbl_ShoppingCart | //div[@id='Cart']//h2[contains(text(),'Shopping Cart')] |
| Cart/lnk_ProceedCheckout | //a[contains(text(),'Proceed to Checkout')] |

Catatan: kalau ada locator yang tidak ketemu, pakai Spy Web dan ganti XPath-nya.
