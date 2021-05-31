package subtask1

class HappyArray {


    fun convertToHappy(sadArray: IntArray): IntArray {
        var newArray=sadArray.toMutableList()
        println(newArray)
        var check=false

        for (i in 1 until newArray.lastIndex){
            if ((newArray[i-1]+newArray[i+1])<newArray[i]){
                check=true
                newArray.removeAt(i)
                break
            }
        }

        return if (check) convertToHappy(newArray.toIntArray())
        else newArray.toIntArray()
    }
}

