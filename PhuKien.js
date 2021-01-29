var MangPhuKien = [
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
var PhuKien = '<ul>'
for(var i = 0; i < 4; i++){
    PhuKien += '<li><a href="#"><img src="'+MangPhuKien[i].HinhAnh+'" alt="'+MangPhuKien[i].TenSanPham+'"></a>'
            +'<div class="row">'
                +'<span class="TenSanPham">'+MangPhuKien[i].TenSanPham+'</span>'
                +'<span class="GiaSanPham">'+MangPhuKien[i].GiaSanPham+'đ</span>'
            +'</div>'
          +'</li>'
}
PhuKien +='</ul>'
document.getElementById('HinhAnhPhuKien').innerHTML=PhuKien
