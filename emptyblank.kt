val s = ""

println(s.isEmpty())
//true
println(s.isBlank())
//true
println(s.isNullOrBlank() ||
        s.isNullOrEmpty())
//true

val s = "          "

println(s.isEmpty())
//false
println(s.isBlank())
//true