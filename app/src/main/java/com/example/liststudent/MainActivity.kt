package com.example.liststudent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var studentAdapter: StudentAdapter
    private lateinit var studentList: MutableList<Student>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi RecyclerView
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Data hardcoded mahasiswa
        studentList = mutableListOf(
            Student("2312500982", "Zhuhaega", "2312500982@student.budiluhur.ac.id", "02/03/2005"),
            Student("2312546789", "Andika", "2312546789@student.budiluhur.ac.id", "05/03/1999"),
            Student("2213098764", "Putri", "2213098764@student.budiluhur.ac.id", "12/12/2001"),
            Student("2413245870", "Fidya", "2413245870@student.budiluhur.ac.id", "20/11/2000"),
            Student("2311908765", "Laras", "2311908765@student.budiluhur.ac.id", "15/07/1998")
        )

        // Set adapter untuk RecyclerView
        studentAdapter = StudentAdapter(studentList)
        recyclerView.adapter = studentAdapter
    }
}
