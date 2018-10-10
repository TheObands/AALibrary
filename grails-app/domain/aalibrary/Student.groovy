package aalibrary

class Student {
    
    String code
    String name
    String lastName
    
    static hasMany = [book:Book]
    static constraints = {
        code(display:true)
        name(display:true)
        lastName(display:true)
    }
}
