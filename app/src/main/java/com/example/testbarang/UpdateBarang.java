package com.example.testbarang;

private void updateBarang(Barang barang) {
        /**
         * Baris kode yang digunakan untuk mengupdate data barang
         * yang sudah dimasukkan di Firebase Realtime Database
         */
        database.child("barang") //akses parent index, ibaratnya seperti nama tabel
        .child(barang.getKey()) //select barang berdasarkan key
        .setValue(barang) //set value barang yang baru
        .addOnSuccessListener(this, new OnSuccessListener<Void>() {
@Override
public void onSuccess(Void aVoid) {

        /**
         * Baris kode yang akan dipanggil apabila proses update barang sukses
         */
        Snackbar.make(findViewById(R.id.bt_submit), "Data berhasil diupdatekan", Snackbar.LENGTH_LONG).setAction("Oke", new View.OnClickListener() {
@Override
public void onClick(View view) {
        finish();
        }
        }).show();
        }
        });
        }