package ru.proweb63.soccerquizapp

class QuizItem {
    var question: String
    var answerList: List<String>

    constructor(question: String, answer: List<String>) {
        this.question = question
        this.answerList = answer
    }
}