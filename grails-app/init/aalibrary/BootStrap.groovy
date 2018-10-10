package aalibrary

import crudwebapp.*

class BootStrap {

    def init = { servletContext ->
        
        def Student s1 = new Student(code:"1111",name:"Juan",lastName:"Obando").save(failOnError:true);
        def Student s2 = new Student(code:"0000",name:"Eliana",lastName:"Angarita").save(failOnError:true);
        def Student s3 = new Student(code:"2222",name:"Sebastian",lastName:"Giraldo").save(failOnError:true);
        
        def Book b1 = new Book(reference:"B111",title:"Rose");
        def Book b2 = new Book(reference:"C111",title:"Moby-Dick");
        def Book b3 = new Book(reference:"D111",title:"Rayuela");
        def Book b4 = new Book(reference:"A111",title:"Divergent");
       
        s1.addToBook(b1);
        s1.addToBook(b2);
        s2.addToBook(b3);
        s3.addToBook(b4);
        
        s1.save(flush:true)
        s2.save(flush:true)
        s3.save(flush:true)
        
    }
    def destroy = {
    }
}
