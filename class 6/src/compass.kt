enum class compass(var shortName: Char) {
    NORTH('N'){
        override fun displayDir(){
            println("This is North")
        }
    },
    SOUTH(shortName = 'S'){
        override fun displayDir(){
            println("This is South")
        }
    },
    EAST(shortName = 'E'){
        override fun displayDir(){
            println("This is East")
        }
    },
    WEST(shortName = 'W'){
        override fun displayDir(){
            println("This is West")
        }
    };
    abstract fun displayDir() // this line to finish up override functions.

    // ENDS WITH ; these are the options for the class. must be in caps.
}