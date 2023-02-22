import { Component, ViewChild } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-classes',
  templateUrl: './classes.component.html',
  styleUrls: ['./classes.component.css']
})
export class ClassesComponent {

  classes: any[] = [];
  showClassList = false;

  @ViewChild('titleInput') titleInput: any;
  @ViewChild('descriptionInput') descriptionInput: any;

  constructor(private http: HttpClient) {}

  getClasses() {
    this.http.get<any[]>('http://localhost:8080/classes').subscribe(data => {
      this.classes = data;
    });
  }

  addClasses() {
    const title = this.titleInput.nativeElement.value;
    const description = this.descriptionInput.nativeElement.value;

    const newClass = { title, description };

    this.http.post('http://localhost:8080/classes', newClass).subscribe(() => {
      this.getClasses();
    });
  }

  confirmDelete(id: number) {
    if(confirm("Are you sure you want to delete this class?")) {
      this.deleteClass(id);
      
    }
  }

  deleteClass(id: number) {
    this.http.delete(`http://localhost:8080/classes/${id}`).subscribe(() => {
      this.getClasses();
    });
  }


  toggleClassList() {
    this.showClassList = !this.showClassList;
  }



  getStyle(index: number) {
    if(index %2 ==0) {
      return "even";
    } else {
      return "odd";
    }
  }

}
