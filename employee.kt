
package Oops
fun main() {
    var employee = Employee(501, "bhargavi")
    employee.displayEmployeeInfo()
}
class Employee(id:Int=501,name:String="",dept:String="bench"){
    var id:Int=id
    var name:String=name
    var dept:String=dept
    fun displayEmployeeInfo(){
        println("$id $name $dept")}

    }

