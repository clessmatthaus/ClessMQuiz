package fr.clesspavy.clessmquiz

data class QuestionData (
    var id:Int,
    var question:String,
    var option_one:String,
    var option_two:String,
    var option_three:String,
    var option_four:String,
    var option_five:String,
    var correct_ans:Int

        )
