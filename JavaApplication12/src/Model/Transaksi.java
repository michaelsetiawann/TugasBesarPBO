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
public class Transaksi {

    int id_transaksi;
    int id_user;
    int id_barang;
//    Date tanggal;
    String status;
    String pesan_review;
    int rating;

    @Override
    public String toString() {
        return "Transaksi{" + "id_transaksi=" + id_transaksi + ", id_user=" + id_user + ", id_barang=" + id_barang + ", status=" + status + ", pesan_review=" + pesan_review + ", rating=" + rating + '}';
    }

    public int getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_barang() {
        return id_barang;
    }

    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPesan_review() {
        return pesan_review;
    }

    public void setPesan_review(String pesan_review) {
        this.pesan_review = pesan_review;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}
