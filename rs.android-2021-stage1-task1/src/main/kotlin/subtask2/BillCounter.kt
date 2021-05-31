package subtask2

import java.util.*

class BillCounter {


    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {

        val num= k
        val billArray = bill.toMutableList()
        val num2= b
        val actual:Int=billArray.filterIndexed{index,i->
            index!=num
        }.sum()/2
        return if (num2==actual) "Bon Appetit"
        else {
            (num2-actual).toString()
        }

    }
}
