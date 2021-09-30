package fr.clesspavy.clessmquiz

object setData {
    const val name:String="name"
    const val score:String="score"

   fun getQuestion():ArrayList<QuestionData>{
       var que:ArrayList<QuestionData> = arrayListOf()
       var question1=QuestionData(
           1,
          "Quelle est la Capitale de la République du Congo?",

           "Luanda",
           "Brazzaville",
           "Kinshasa",
           "Bangui",
           "Abidjan",
            2
       )
       var question2=QuestionData(
           2,
           "Quel pays a remporté la coupe du monde de football en 2014?",

           "L'Allemagne'",
           "Le Brésil",
           "L'Argentine",
           "L'Italie",
           "Le Portugal",
           1
       )
       var question3=QuestionData(
           3,
           "Qui était le dieu de la guerre dans la mythologie grecque?",

           "Arès",
           "Apollon",
           "Hermés",
           "Hadès",
           "Aucunes de ces réponses",
           1
       )
       var question4=QuestionData(
           4,
           "Quelle est, environ, la vitesse de la lumière?",

           "400 000km/s",
           "3 000 000 km/s",
           "3000 km/s",
           "300 000 km/s",
           "100 km/s",
           4
       )
       var question5=QuestionData(
           5,
           "En 1984, Thomas Sankara renomme la Huate-Volta le <<Burkina Faso>>, ce qui signifie...",

           "le pays des Hommes libres",
           "le pays de l'abondance ",
           "le pays de Hommes intègres",
           "la terre de la vertu",
           "la nation équitable",
           3
       )
       var question6=QuestionData(
           6,
           "12000 secondes sont égales à :",

           "3 h 30 min",
           "4 h 40 min",
           "3 h 33 min",
           "3 h 10 min",
           "200 heures",
           3
       )
       que.add(question1)
       que.add(question2)
       que.add(question3)
       que.add(question4)
       que.add(question5)
       que.add(question6)
       return que
   }
}