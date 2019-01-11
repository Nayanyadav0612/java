PROCEDURAL
int main()
{
Report report;
AddName(Report,1);
AddRoll(Report,1);
AddClass(Report,1);
AddBatch(Report,1);
AddSubject(Report,5);
Grades(Report,5);
Total(Report,1);
Std::cout<<”Result Is Ready”;
return 0;
}

OBJECT ORIENTED
int main(){
Report report;
Name name(1);
Roll roll(1);
Class class(1);
Batch batch(1);
Subject subject(5);
Grades grades(5);
Total total(1);
Report.add(Name);
Report.add(Roll);
Report.add(Class);
Report.add(Batch);
Report.add(Subjects);
Report.add(Grades);
Report.add(Total);
Std::cout<<”Result Is Ready”;
return 0;
}