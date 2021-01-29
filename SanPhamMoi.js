var MangSanPhamMoi = [
    {
        HinhAnh: "./HinhAnh/10000.jpg",
        MaSanPham: 10000,
        TenSanPham: "CRUX",
        GiaSanPham: 4800000
    },
    {
        HinhAnh: "./HinhAnh/10001.jpg",
        MaSanPham: 10001,
        TenSanPham: "GUNMETAL ROSE",
        GiaSanPham: 5300000,
    },
    {
        HinhAnh: "./HinhAnh/10002.jpg",
        MaSanPham: 10002,
        TenSanPham: "MAGNOLIA",
        GiaSanPham: 4100000
    },
    {
        HinhAnh: "./HinhAnh/10003.jpg",
        MaSanPham: 10003,
        TenSanPham: "BLACK PINK",
        GiaSanPham: 3400000
    }
]
var SanPhamMoi = '<ul>'
for(var i = 0; i < 4; i++){
    SanPhamMoi += '<li><a href="#"><img src="'+MangSanPhamMoi[i].HinhAnh+'" alt="'+MangSanPhamMoi[i].TenSanPham+'"></a>'
            +'<div class="row">'
                +'<span class="TenSanPham">'+MangSanPhamMoi[i].TenSanPham+'</span>'
                +'<span class="GiaSanPham">'+MangSanPhamMoi[i].GiaSanPham+'đ</span>'
            +'</div>'
          +'</li>'
}
SanPhamMoi +='</ul>'
document.getElementById('HinhAnhSanPhamMoi').innerHTML=SanPhamMoi

