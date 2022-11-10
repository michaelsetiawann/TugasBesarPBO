/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author acer
 */
public class Barang {

    int id_barang;
    int id_toko;
    String nama_barang;
    int jumlah_barang;
    double harga_barang;
    String deskripsi_barang;
    int jumlah_pengunjung;
    String status;

    @Override
    public String toString() {
        return "Barang{" + "id_barang=" + id_barang + ", id_toko=" + id_toko + ", nama_barang=" + nama_barang + ", jumlah_barang=" + jumlah_barang + ", harga_barang=" + harga_barang + ", deskripsi_barang=" + deskripsi_barang + ", jumlah_pengunjung=" + jumlah_pengunjung + ", status=" + status + '}';
    }

    public int getId_barang() {
        return id_barang;
    }

    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    public int getId_toko() {
        return id_toko;
    }

    public void setId_toko(int id_toko) {
        this.id_toko = id_toko;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public int getJumlah_barang() {
        return jumlah_barang;
    }

    public void setJumlah_barang(int jumlah_barang) {
        this.jumlah_barang = jumlah_barang;
    }

    public double getHarga_barang() {
        return harga_barang;
    }

    public void setHarga_barang(double harga_barang) {
        this.harga_barang = harga_barang;
    }

    public String getDeskripsi_barang() {
        return deskripsi_barang;
    }

    public void setDeskripsi_barang(String deskripsi_barang) {
        this.deskripsi_barang = deskripsi_barang;
    }

    public int getJumlah_pengunjung() {
        return jumlah_pengunjung;
    }

    public void setJumlah_pengunjung(int jumlah_pengunjung) {
        this.jumlah_pengunjung = jumlah_pengunjung;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
