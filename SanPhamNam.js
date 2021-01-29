var MangSanPhamNam = [
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
var SanPhamNam = '<ul>'
for(var h = 0; h < 4; h++){
    SanPhamNam += '<li><a href="#"><img src="'+MangSanPhamNam[h].HinhAnh+'" alt="'+MangSanPhamNam[h].TenSanPham+'"></a>'
            +'<div class="row">'
                +'<span class="TenSanPham">'+MangSanPhamNam[h].TenSanPham+'</span>'
                +'<span class="GiaSanPham">'+MangSanPhamNam[h].GiaSanPham+'đ</span>'
            +'</div>'
          +'</li>'
}
SanPhamNam +='</ul>'
document.getElementById('HinhAnhSanPhamNam').innerHTML=SanPhamNam
