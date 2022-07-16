package com.example.palemprak

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Gallerydudi : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallerydudi)

        val actionBar = supportActionBar
        actionBar!!.title = "Dunia Industri"
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)


        val imageList = listOf<Gallery>(
            Gallery(R.drawable.anugrahkom,
                 "Anugrah Komputer",
                 "Anugrah Komputer, Toko servis komputer dan instalasi CCTV, yang beralamat di Pertigaan magangan, Jl. Raya Petambakan, Empat, Rakitan, Madukara, Banjarnegara, Central Java 53482."
            ),
            Gallery(R.drawable.awsmedia,
                 "AWS MediaNET",
                 "AWS MediaNET, penyedia Webhosting Provider, Domain Registration, Web & Blockchain Development & Crypto Trader | Our Web & Services = hikahost_com cryptovir_com prakerin_my_id jasasuper_com, yang beralamat di RT 01.04, Mandiraja,, Mandiraja Kulon, Kec. Mandiraja, Kab. Banjarnegara, Jawa Tengah 53473."
            ),
            Gallery(R.drawable.datatech,
                 "Datatech Solution",
                 "Datatech Solution, Toko peralatan jaringan dan pemasangan jaringan internet, yang beralamat di Ruko Stasiun No. 10, JL Mayjend, Jl. Bambang Sugeng, Semarang, Kec. Banjarnegara, Kab. Banjarnegara, Jawa Tengah 53418."
            ),
            Gallery(R.drawable.djavakom,
                 "Djava Komputer",
                 "Djava Komputer, Toko servis dan jual beli sparepart laptop komputer, yang beralamat di Jl. Argandaru, Dusun 5, Bukateja, Kec. Bukateja, Kabupaten Purbalingga, Jawa Tengah 53382."
            ),
            Gallery(R.drawable.hitamputih,
                 "Hitam Putih Multimedia",
                 "Hitam Putih Multimedia, Toko servis dan jual beli sparepart laptop komputer, yang beralamat di Jl. Gotong Royong No.15, Kutabanjarnegara, Kec. Banjarnegara, Kab. Banjarnegara, Jawa Tengah 53418."
            ),
            Gallery(R.drawable.kreasik,
                "Kreasik Production",
                "Kreasik Production, Tempat percetakan komersial, yang beralamat di Jl. S. Parman, Parakancanggah, Kec. Banjarnegara, Kab. Banjarnegara, Jawa Tengah 53412."

            ),
            Gallery(R.drawable.majurejo,
                 "Majurejo Network",
                 "Majurejo Network, Toko peralatan jaringan dan pemasangan jaringan internet, yang beralamat di Pertigaan eks. Pasar Tlete, Jl. Raya Klampok Raya Timur No.6, Dusun Tlete, Klampok, Kec. Purworejo Klampok, Kab. Banjarnegara, Jawa Tengah 53474."
            ),
            Gallery(R.drawable.mayodistro,
                 "Mayo Distro",
                 "Mayo Distro, Toko pakaian dan percetakan komersial, yang beralamat di Jl. Mandiraja - Rakit, Mandiraja Kulon, Mandiraja Wetan, Kec. Mandiraja, Kab. Banjarnegara, Jawa Tengah 53473."
            ),
            Gallery(R.drawable.mitradata,
                 "Mitradata",
                 "Mitradata, Jasa pemasangan jaringan berbasis fiber optik dan wireless, yang beralamat di Tapen Krajan, Tapen, Kec. Wanadadi, Kab. Banjarnegara, Jawa Tengah 53461."
            ),
            Gallery(R.drawable.mtsn4,
                 "Mts Negeri 4 Banjarnegara",
                 "MTs Negeri 4 Banjarnegara, Sekolah menengah pertama berbasis agama, yang beralamat di Jl. Raya Lengkong No.60, Depok, Lengkong, Kec. Rakit, Kab. Banjarnegara, Jawa Tengah 53463."
            ),
            Gallery(R.drawable.nentinen,
                 "Nentinen Apparel",
                 "Nentinen Apparel, Toko pakaian dan percetakan jersey/apparel, yang beralamat di Dusun Satu, Karangjambe, Kec. Wanadadi, Kab. Banjarnegara, Jawa Tengah 53461."
            ),
            Gallery(R.drawable.tunasmultidata,
                "Tunas Multi Data",
                "Tunas Multi Data, Toko peralatan jaringan dan pemasangan jaringan internet, yang beralamat di Jl. Raya Kenteng - Madukara, Kec. Madukara, Kab. Banjarnegara, Jawa Tengah 53482."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = GalleryAdapter(this, imageList){
            val intent = Intent(this, GalleryDetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}