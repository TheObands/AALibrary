package aalibrary

class Report_stu_booController {
    static defaultAction = "report"

    def index() 
    { 
        
    }
    def report()
    {
      def Students = Student.list()
      def Books = Book.list()
      render(view: "report_stu_boo", model: [students : Students, books : Books])
    }
}
