USE [master]
GO
IF EXISTS (select * from sysdatabases where name='MUABANXEMAY')
		drop database MUABANXEMAY
GO
CREATE DATABASE MUABANXEMAY

USE MUABANXEMAY

CREATE TABLE LoaiXe
(
	maLoaiXe varchar(50) not null PRIMARY KEY, 
	tenLoaiXe nvarchar(100) not null
)

CREATE TABLE Xe 
(
	maXe varchar(30) not null PRIMARY KEY,
	tenXe nvarchar(100) not null,
	mauXe nvarchar(50) not null,
	nuocSanXuat nvarchar(50) not null,
	hangXe nvarchar(50) not null,
	giaBan float not null,
	soKhung nvarchar(30) not null,
	phanKhoi nvarchar(20) not null,
	soLuong int not null,
	maLoaiXe varchar(50) not null	CONSTRAINT fk_MaLoaiXe 
							        FOREIGN KEY (maLoaiXe)
							        REFERENCES LoaiXe(maLoaiXe)
							        ON DELETE cascade
							        ON UPDATE cascade
)

CREATE TABLE KhachHang 
(
	maKH int IDENTITY(1,1) not null PRIMARY KEY,
	hoTen nvarchar(50) not null,
	soDT varchar(20) not null,
	diaChi nvarchar(200) not null,
	soCCCD varchar(20) not null,
	gioiTinh bit not null
)

CREATE TABLE LoaiNhanVien
(
	maLoaiNV varchar(30) not null PRIMARY KEY,
	tenLoaiNV nvarchar(100) not null,
)

CREATE TABLE NhanVien 
(
	maNV varchar(10) not null PRIMARY KEY,
	hoTen nvarchar(100) not null,
	soDT varchar(20) not null,
	soCCCD varchar(20) not null,
	diaChi nvarchar(200) not null,
	gioiTinh bit not null,
	chucVu nvarchar(100) not null,
	maLoaiNV varchar(30) not null	CONSTRAINT fk_MaLoaiNV 
							        FOREIGN KEY (maLoaiNV)
							        REFERENCES LoaiNhanVien(maLoaiNV)
							        ON DELETE cascade
							        ON UPDATE cascade
)
CREATE TABLE TaiKhoan
(
	tenDN varchar(30) not null PRIMARY KEY,
	matKhau varchar(30) not null,
	maNV varchar(10) not null	CONSTRAINT fk_MaNV
								FOREIGN KEY (maNV)
								REFERENCES NhanVien(maNV)
								ON DELETE cascade
								ON UPDATE cascade
)
CREATE TABLE HopDong
(
	maHopDong varchar(20) not null PRIMARY KEY,
	ngayLap datetime not null,
	thoiHanBaoHanh nvarchar(10) not null,
	soTienPhaiTT float not null,
	soTienDaTT float not null,
	soLanTT int not null,
	maKH int not null	CONSTRAINT fk_MaKH
						FOREIGN KEY (maKH)
						REFERENCES KhachHang(maKH)
						ON DELETE cascade
						ON UPDATE cascade,
	maNV varchar(10) not null	CONSTRAINT fk_MaNV_HopDong
								FOREIGN KEY (maNV)
								REFERENCES NhanVien(maNV)
								ON DELETE cascade
								ON UPDATE cascade,
	maXe varchar(30) not null	CONSTRAINT fk_MaXe
								FOREIGN KEY (maXe)
								REFERENCES Xe(maXe)
								ON DELETE cascade
								ON UPDATE cascade

)
ALTER TABLE HopDong
ALTER COLUMN soLanTT varchar(10) not null

CREATE TABLE HoaDon 
(
	maHoaDon int IDENTITY(1,1) not null PRIMARY KEY,
	ngayLap datetime not null,
	tongTien float not null,
	nguoiNhan nvarchar(200) not null,
	maHopDong varchar(20) not null	CONSTRAINT fk_MaHopDong
									FOREIGN KEY (maHopDong)
									REFERENCES HopDong(maHopDong)
									ON DELETE cascade
									ON UPDATE cascade

)
ALTER TABLE HoaDon
ADD maNV varchar(10) not null

ALTER TABLE HoaDon 
ADD CONSTRAINT fk_MaNV_HoaDon FOREIGN KEY (maNV) REFERENCES NhanVien (maNV);

CREATE TABLE ChiTietHoaDon 
(
	maCTHoaDon int IDENTITY(1,1) not null PRIMARY KEY,
	donGia float not null,
	soLuongMua int not null,
	donViTinh nvarchar(20) not null,
	khuyenMai nvarchar(10) not null,
	thanhTien float not null,
	maHoaDon int not null		CONSTRAINT fk_MaHoaDon
								FOREIGN KEY (maHoaDon)
								REFERENCES HoaDon(maHoaDon)
								ON DELETE cascade
								ON UPDATE cascade
)

INSERT INTO [dbo].[LoaiXe] ([maLoaiXe], [tenLoaiXe]) VALUES (N'xeso', N'Xe số')
INSERT INTO [dbo].[LoaiXe] ([maLoaiXe], [tenLoaiXe]) VALUES (N'xesotudong', N'Xe số tự động')
INSERT INTO [dbo].[LoaiXe] ([maLoaiXe], [tenLoaiXe]) VALUES (N'phankhoilon', N'Xe phân khối lớn')

INSERT INTO [dbo].[Xe] ([maXe], [tenXe], [mauXe], [nuocSanXuat], [hangXe], [giaBan], [soKhung], [phanKhoi], [soLuong], [maLoaiXe]) 
VALUES (N'AB2021', N'Air Black 2021', N'Màu xám', N'Nhật Bản', N'Honda', 42000000, N'JF63E049557', N'125cc', 25, N'xesotudong')
INSERT INTO [dbo].[Xe] ([maXe], [tenXe], [mauXe], [nuocSanXuat], [hangXe], [giaBan], [soKhung], [phanKhoi], [soLuong], [maLoaiXe]) 
VALUES (N'AB2022', N'Air Black 2022', N'Màu đen', N'Nhật Bản', N'Honda', 46000000, N'JF63E565218', N'160cc', 30, N'xesotudong')
INSERT INTO [dbo].[Xe] ([maXe], [tenXe], [mauXe], [nuocSanXuat], [hangXe], [giaBan], [soKhung], [phanKhoi], [soLuong], [maLoaiXe]) 
VALUES (N'SH2021', N'SH 150i 2021 ABS', N'Màu trắng', N'Nhật Bản', N'Honda', 82500000, N'JF59C325562', N'150cc', 12, N'xesotudong')
INSERT INTO [dbo].[Xe] ([maXe], [tenXe], [mauXe], [nuocSanXuat], [hangXe], [giaBan], [soKhung], [phanKhoi], [soLuong], [maLoaiXe]) 
VALUES (N'FT2021', N'Honda Future 2021', N'Màu xanh đen', N'Thái Lan', N'Honda', 31800000, N'NF11021452', N'125cc', 60, N'xeso')
INSERT INTO [dbo].[Xe] ([maXe], [tenXe], [mauXe], [nuocSanXuat], [hangXe], [giaBan], [soKhung], [phanKhoi], [soLuong], [maLoaiXe]) 
VALUES (N'WAAN2023', N'Wave AlPha 2023', N'Màu đỏ bạc', N'Malaysia', N'Honda', 18500000, N'MA3212355978', N'110cc', 50, N'xeso')
INSERT INTO [dbo].[Xe] ([maXe], [tenXe], [mauXe], [nuocSanXuat], [hangXe], [giaBan], [soKhung], [phanKhoi], [soLuong], [maLoaiXe]) 
VALUES (N'PKL2023', N'Yamaha R15 2023', N'Màu đen', N'Nhật Bản', N'Yamaha', 81500000, N'JF63E049557', N'155cc', 5, N'phankhoilon')

INSERT [dbo].[LoaiNhanVien] ([maLoaiNV], [tenLoaiNV]) VALUES (N'hanhchinh', N'Nhân viên hành chính')
INSERT [dbo].[LoaiNhanVien] ([maLoaiNV], [tenLoaiNV]) VALUES (N'kithuat', N'Nhân viên kĩ thuật')

INSERT [dbo].[NhanVien] ([maNV], [hoTen], [soDT], [soCCCD], [diaChi], [gioiTinh], [chucVu], [maLoaiNV]) VALUES (N'20001031', N'Phạm Hoàng Ngọc Quân', N'0832006558', N'079200012011', N'Gò Vấp', 0, N'Quản lí', N'hanhchinh')
INSERT [dbo].[NhanVien] ([maNV], [hoTen], [soDT], [soCCCD], [diaChi], [gioiTinh], [chucVu], [maLoaiNV]) VALUES (N'20001032', N'Nguyễn Phi Trường', N'0832006559', N'0792000123456', N'Gò Vấp', 0, N'Nhân viên', N'hanhchinh')
INSERT [dbo].[NhanVien] ([maNV], [hoTen], [soDT], [soCCCD], [diaChi], [gioiTinh], [chucVu], [maLoaiNV]) VALUES (N'20001033', N'Võ Văn Khoa', N'0832006550', N'079200045678', N'Gò Vấp', 0, N'Nhân viên', N'hanhchinh')
INSERT [dbo].[NhanVien] ([maNV], [hoTen], [soDT], [soCCCD], [diaChi], [gioiTinh], [chucVu], [maLoaiNV]) VALUES (N'20001034', N'Đặng Ngọc Minh', N'0832006551',  N'079200011223',N'Gò Vấp', 0, N'Nhân viên', N'kithuat')


INSERT [dbo].[TaiKhoan] ([tenDN],[matKhau],[maNV]) VALUES (N'user1', N'123456', N'20001031')
INSERT [dbo].[TaiKhoan] ([tenDN],[matKhau],[maNV]) VALUES (N'user2', N'123456', N'20001032')
INSERT [dbo].[TaiKhoan] ([tenDN],[matKhau],[maNV]) VALUES (N'user3', N'123456', N'20001033')
INSERT [dbo].[TaiKhoan] ([tenDN],[matKhau],[maNV]) VALUES (N'user4', N'123456', N'20001034')

