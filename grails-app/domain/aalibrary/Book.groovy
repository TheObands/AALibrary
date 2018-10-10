package aalibrary

class Book {
    
    String reference
    String title
    static belongsTo = [student:Student]

    static constraints = {
        reference(display:true)
        title(display:true)
    }
}
