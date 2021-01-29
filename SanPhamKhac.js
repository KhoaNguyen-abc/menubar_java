var MangSanPhamKhac = [
    {
        HinhAnh: "./HinhAnh/10004.jpg",
        TenTheLoai:"Đồng hồ",
    },
    {
        HinhAnh: "./HinhAnh/10005.jpg",
        TenTheLoai:"Mắt kính",
    },
    {
        HinhAnh: "./HinhAnh/10006.jpg",
        TenTheLoai: "Trang sức"
    }
]
var SanPhamKhac = '<ul>'
for(var j=0; j < 3; j++){
    SanPhamKhac += '<li><a href="#"><img src="'+MangSanPhamKhac[j].HinhAnh+'" alt="'+MangSanPhamKhac[j].TenTheLoai+'"></a>'
            +'<div class="row">'
                +'<span class="TenTheLoai">'+MangSanPhamKhac[j].TenTheLoai+'</span>'
                +'<a href="#" class="XemThem">XEM THÊM</a>'
            +'</div>'
          +'</li>'
}
SanPhamKhac +='</ul>'
document.getElementById('SanPhamKhac').innerHTML=SanPhamKhac