package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.FragmentListBinding

class List: Fragment() {

    private var binding : FragmentListBinding? = null
    lateinit var rv_hero : RecyclerView
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_list, container, false)

        //<-- Recycleview -->

        val lm = LinearLayoutManager(activity)
        lm.orientation = LinearLayoutManager.VERTICAL
        rv_hero = view.findViewById(R.id.rv_hero)

        val adapterHero = SuperAdapter(ArrayHero,activity)
        rv_hero.setHasFixedSize(true)
        rv_hero.layoutManager = lm
        rv_hero.adapter = adapterHero

        return view
    }

    val ArrayHero : ArrayList<Superhero>get(){
        val arrayhero = ArrayList<Superhero>()

        val superhero1 = Superhero()
        superhero1.imgSuperhero = R.drawable.makan9
        superhero1.nameSuperhero = "Cinammon Roll"
        superhero1.descSuperhero = "Menu Utama"

        val superhero2 = Superhero()
        superhero2.imgSuperhero = R.drawable.makan10
        superhero2.nameSuperhero = "Pisang keju Coklat"
        superhero2.descSuperhero = "Menu Utama"
        val superhero4 = Superhero()
        superhero4.imgSuperhero = R.drawable.makan1
        superhero4.nameSuperhero = "Burger"
        superhero4.descSuperhero = "Menu Favorite"

        val superhero5 = Superhero()
        superhero5.imgSuperhero = R.drawable.makan2
        superhero5.nameSuperhero = "sandwich"
        superhero5.descSuperhero = "Menu Favorite"

        val superhero6 = Superhero()
        superhero6.imgSuperhero = R.drawable.makan3
        superhero6.nameSuperhero = "Martabak"
        superhero6.descSuperhero = "Menu Utama"

        val superhero7 = Superhero()
        superhero7.imgSuperhero = R.drawable.makan4
        superhero7.nameSuperhero = "Pancake"
        superhero7.descSuperhero = "Menu Utama"

        val superhero8 = Superhero()
        superhero8.imgSuperhero = R.drawable.makan5
        superhero8.nameSuperhero = "Wafel"
        superhero8.descSuperhero = "Menu Favorite"
        val superhero9 = Superhero()
        superhero9.imgSuperhero = R.drawable.makan6
        superhero9.nameSuperhero = "Kebab"
        superhero9.descSuperhero = "Menu Utama"

        val superhero10 = Superhero()
        superhero10.imgSuperhero = R.drawable.makan7
        superhero10.nameSuperhero = "Roti Bakar "
        superhero10.descSuperhero = "Menu Favorite"

        val superhero11 = Superhero()
        superhero11.imgSuperhero = R.drawable.makan8
        superhero11.nameSuperhero = "Donat"
        superhero11.descSuperhero = "Menu Favorite"
        arrayhero.add(superhero1)
        arrayhero.add(superhero2)
        arrayhero.add(superhero4)
        arrayhero.add(superhero5)
        arrayhero.add(superhero6)
        arrayhero.add(superhero7)
        arrayhero.add(superhero8)
        arrayhero.add(superhero9)
        arrayhero.add(superhero10)
        arrayhero.add(superhero11)

        return arrayhero
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null

    }
}