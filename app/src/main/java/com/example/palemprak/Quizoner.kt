package com.example.palemprak

data class Quizoner(
    val id: Int,
    val text: String,
    val image: Int,
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val correctAnswer: String
)

fun getQuizoner(): ArrayList<Quizoner> {
    val quizoner = ArrayList<Quizoner>()

    quizoner.add(
    Quizoner(
       0,
       "To which programming language does this mascot belongs?",
        R.drawable.kotlin_mascot,
        "java",
        "Marshmallow",
        "C++",
        "Kotlin",
        "Kotlin"
      )
    )

    quizoner.add(
        Quizoner(
            1,
            "Which language is the easiest to learn?",
            R.drawable.languages,
            "Kotlin",
            "C++",
            "Java",
            "Python",
            "Python"
        )
    )

    quizoner.add(
        Quizoner(
            2,
            "Which one is used to implement an infinite loop?",
            R.drawable.loop,
            "For loop",
            "Infinix loop",
            "While loop",
            "Repeat loop",
            "While loop"
        )
    )

    quizoner.add(
        Quizoner(
            3,
            "What exactly is the 'Int' keyword used in programming languages?",
            R.drawable.datatypes,
            "Loop",
            "Data type",
            "Collection",
            "International",
            "Data type"
        )
    )

    quizoner.add(
        Quizoner(
            4,
            "Which is the entry-point function in kotlin?",
            R.drawable.kotlin,
            "Main",
            "Top",
            "Enter",
            "Func",
            "Main"
        )
    )

    return quizoner
}