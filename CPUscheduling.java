//Name-Shivangi Goel
//Roll_number-1710110309
package osgla1;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
 import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class CPUscheduling  implements ActionListener{
     JFrame f1= new JFrame("INPUT SCREEN");
    JLabel lab1= new JLabel("Number of processors (<=6)         ");
    Integer arr[]= {1,2,3,4,5,6};
    JComboBox cb= new JComboBox(arr); 
  JLabel lab2= new JLabel("BURST TIME        ");
  JTextField tf2= new JTextField(30);
  JLabel lab3= new JLabel("ARRIVAL TIME      ");
  JTextField tf3= new JTextField(30);
  JLabel lab4= new JLabel("PRIORITY             ");
  JTextField tf4= new JTextField(30);
  JLabel lab5= new JLabel("TIME QUANTUM ");
  JTextField tf5= new JTextField(10);
    JCheckBox cb1= new JCheckBox("First Come First Serve");
    JCheckBox cb2= new JCheckBox("Preemptive Shortest Job First");
    JCheckBox cb3= new JCheckBox("Non- Preemptive Shortest Job First");
    JCheckBox cb4= new JCheckBox("Round robin");
    JCheckBox cb5= new JCheckBox("Preemptive Priority");
    JCheckBox cb6= new JCheckBox("Non- Preemptive Priority");
    JButton jb= new JButton("COMPUTE");
    JPanel p1= new JPanel();
    JPanel p2= new JPanel();
    JPanel p3= new JPanel();
    JPanel p4= new JPanel();
    JPanel p5= new JPanel();
    JPanel p6= new JPanel();
    JPanel p7= new JPanel();
    JPanel p8= new JPanel();
    JPanel p9= new JPanel();
    JPanel p10= new JPanel();
    JPanel p11= new JPanel();
    JPanel p12= new JPanel();
                  
   int bt[],at[],pri[],temp[],wt[],tat[],ct[];
   String p[];
   Integer s1;
   boolean stat[];
   
   JFrame f2= new JFrame("OUTPUT SCREEN");
        JPanel p13= new JPanel();
    JPanel p14= new JPanel();
    JPanel p15= new JPanel();
    JPanel p16= new JPanel();
    JPanel p17= new JPanel();
    JPanel p18= new JPanel();
    JPanel p19= new JPanel();
    JPanel p20= new JPanel();
    JPanel p21= new JPanel();
    JPanel p22= new JPanel();
    JPanel p23= new JPanel();
    JPanel p24= new JPanel();
    JPanel p25= new JPanel();
    JPanel p26= new JPanel();
    JPanel p27= new JPanel();
    JPanel p28= new JPanel();
    JPanel p29= new JPanel();
    JPanel p30= new JPanel();
    JPanel p31= new JPanel();
    JPanel p32= new JPanel();
    JPanel p33= new JPanel();
    JPanel p34= new JPanel();
    JPanel p35= new JPanel();
    JPanel p36= new JPanel();
    
     
 CPUscheduling() 
 { 
  jb.addActionListener(this);

p1.setLayout(new FlowLayout(FlowLayout.LEFT));
p2.setLayout(new FlowLayout(FlowLayout.LEFT));
p3.setLayout(new FlowLayout(FlowLayout.LEFT));
p4.setLayout(new FlowLayout(FlowLayout.LEFT));
p5.setLayout(new FlowLayout(FlowLayout.LEFT));
p6.setLayout(new FlowLayout(FlowLayout.LEFT));
p7.setLayout(new FlowLayout(FlowLayout.LEFT));
p8.setLayout(new FlowLayout(FlowLayout.LEFT));
p9.setLayout(new FlowLayout(FlowLayout.LEFT));
p10.setLayout(new FlowLayout(FlowLayout.LEFT));
p11.setLayout(new FlowLayout(FlowLayout.LEFT));
p12.setLayout(new FlowLayout(FlowLayout.CENTER));
p13.setLayout(new FlowLayout(FlowLayout.LEFT));
p14.setLayout(new FlowLayout(FlowLayout.LEFT));
p15.setLayout(new FlowLayout(FlowLayout.LEFT));
p16.setLayout(new FlowLayout(FlowLayout.LEFT));
p17.setLayout(new FlowLayout(FlowLayout.LEFT));
p18.setLayout(new FlowLayout(FlowLayout.LEFT));
p19.setLayout(new FlowLayout(FlowLayout.LEFT));
p20.setLayout(new FlowLayout(FlowLayout.LEFT));
p21.setLayout(new FlowLayout(FlowLayout.LEFT));
p22.setLayout(new FlowLayout(FlowLayout.LEFT));
p23.setLayout(new FlowLayout(FlowLayout.LEFT));
p24.setLayout(new FlowLayout(FlowLayout.LEFT));
p25.setLayout(new FlowLayout(FlowLayout.LEFT));
p26.setLayout(new FlowLayout(FlowLayout.LEFT));
p27.setLayout(new FlowLayout(FlowLayout.LEFT));
p28.setLayout(new FlowLayout(FlowLayout.LEFT));
p29.setLayout(new FlowLayout(FlowLayout.LEFT));
p30.setLayout(new FlowLayout(FlowLayout.LEFT));
p31.setLayout(new FlowLayout(FlowLayout.LEFT));
p32.setLayout(new FlowLayout(FlowLayout.LEFT));
p33.setLayout(new FlowLayout(FlowLayout.LEFT));
p34.setLayout(new FlowLayout(FlowLayout.LEFT));
p1.add(lab1);
p1.add(cb);
p2.add(lab2);
p2.add(tf2);
p3.add(lab3);
p3.add(tf3);
p4.add(lab4);
p4.add(tf4);
p5.add(lab5);
p5.add(tf5);
p6.add(cb1);
p7.add(cb2);
p8.add(cb3);
p9.add(cb4);
p10.add(cb5);
p11.add(cb6);
p12.add(jb);
f1.add(p1);
f1.add(p2);
f1.add(p3);
f1.add(p4);
f1.add(p5);
f1.add(p6);
f1.add(p7);
f1.add(p8);
f1.add(p9);
f1.add(p10);
f1.add(p11);
f1.add(p12);
        f1.setSize(500, 500);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setVisible(true);
        f1.setLayout( new GridLayout(12,1));
        f1.setVisible(true);
        f1.setResizable(false);
        
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //f2.setVisible(true);
      
        f2.setLayout( new GridLayout(24,1));
        
 }
public static void  main(String args[])
    {
        CPUscheduling obja= new CPUscheduling();  
    }
    public void sortbyarrival()
    
    { int i,j,k,t;
    String stemp;
    for(i=0;i<s1-1;i++)
{
   for(j=0;j<s1-1-i;j++){
       if(at[j]>at[j+1])
       {
           t=at[j];
           at[j]= at[j+1];
           at[j+1]=t;
           t=bt[j];
           bt[j]= bt[j+1];
           bt[j+1]=t;
           t=pri[j];
           pri[j]=pri[j+1];
           pri[j+1]=t;
           stemp= p[j];
           p[j]= p[j+1];
           p[j+1]=stemp;
       }
   } 
}
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        f2.setVisible(true);
        f2.setSize(1000,1000);
     s1= (Integer) cb.getSelectedItem();
     String s2= tf2.getText();
     String s3= tf3.getText();
     String s4= tf4.getText();
     String s5= tf5.getText();
     int q= Integer.valueOf(s5);
char ch;
int l2= s2.length();
s2= s2+",";
int l3= s3.length();
s3= s3+",";
int l4= s4.length();
s4= s4+",";


int i,j,k,t;
String stemp;
bt = new int[s1];
at= new int[s1];
pri= new int[s1];
temp= new int[s1];
wt= new int[s1];
tat= new int[s1];
stat= new boolean[s1];
ct= new int[s1];
String[] parts = s2.split(",");
for ( i = 0; i < parts.length; i++) {
bt[i] = Integer.parseInt(parts[i]);
}
parts = s3.split(",");
for ( i = 0; i < parts.length; i++) {
    at[i] = Integer.parseInt(parts[i]);
}
parts = s4.split(",");
for ( i = 0; i < parts.length; i++) {
    pri[i] = Integer.parseInt(parts[i]);
}
int totaltime=0;
for(i=0;i<s1;i++)
  totaltime+=bt[i]; 
 p= new String [s1];
for(i=0;i<s1;i++)
    p[i]= "P"+(i+1);


if(cb1.isSelected())
{  
    String str="0";
    sortbyarrival();
JTextField gantt1[]= new JTextField[s1];
JLabel lab6= new JLabel ("First come First serve");
p13.add(lab6);
int x=0;
for(i=0;i<s1;i++)
{  
   gantt1[i]= new JTextField(x+","+p[i],100/totaltime*bt[i] );
   gantt1[i].setHorizontalAlignment(JTextField.CENTER);
    p14.add(gantt1[i]);
}  
int acc=0;
for(i=0;i<s1;i++)
{   
    tat[i]=acc+bt[i]-at[i];
    wt[i]=tat[i]-bt[i];
    acc+=bt[i];
    for(j=0;j<100/totaltime*bt[i];j++)
    {
        str+="   ";
    }
    str+="             ";
    str+=acc+" ";
}
double avgtat=0.0, avgwt=0.0;
for(i=0;i<s1;i++)
{
    avgtat+=tat[i];
    avgwt+=wt[i];
}
avgtat=avgtat/s1;
avgwt=avgwt/s1;
String s = "Waiting time: ";
for(i=0;i<s1;i++)
{
    s+=p[i]+" : "+ wt[i]+ "|| ";
}
s+="Avg. Waiting time : "+ avgwt+"     "+" Turnaround time : ";
for(i=0;i<s1;i++)
{
    s+=p[i]+" : "+ tat[i]+ "|| ";
}
s+="Avg. Turnaround time : "+ avgtat;
JLabel t1= new JLabel(s);
p25.add(t1);
JLabel time1= new JLabel(str);
p31.add(time1);
    }
if (cb2.isSelected())
        { sortbyarrival();
         int m,n;
        int tt= totaltime;
        for(i=0;i<s1;i++)
        temp[i]=bt[i];
       JTextField gantt2[]= new JTextField[s1];
       JLabel lab10= new JLabel ("Preemptive SJF");
       p15.add(lab10);
         i=0;
         m=0;
           while( ++m<s1 && at[i]== at[m]);
           for(i=0;i<m-1;i++)
{
   for(j=0;j<m-1-i;j++){
       if(bt[j]>bt[j+1])
       {
           t= temp[j];
           temp[j]=temp[j+1];
           temp[j+1]=t;
           t=bt[j];
           bt[j]= bt[j+1];
           bt[j+1]=t;
           t=pri[j];
           pri[j]=pri[j+1];
           pri[j+1]=t;
           stemp= p[j];
           p[j]= p[j+1];
           p[j+1]=stemp;
       }
   } 
}
       
int x=0;
i=0;

while(tt!=0)
{


if(temp[i]==0)
    
{  

    i+=1;
}
tt-=1;
x+=1;
temp[i]-=1;
if(temp[i]==0)
    ct[i]=x;
gantt2[i]= new JTextField(p[i],100/totaltime);
gantt2[i].setHorizontalAlignment(JTextField.CENTER);
    p16.add(gantt2[i]);
j=i;
while(++j<s1 && at[j]<= x);
for(m= i; m< j-1;m++)
{
for(n= i;n< j-1;n++)
{
if(temp[n]>temp[n+1])
{
  t=bt[n];
  bt[n]=bt[n+1];
  bt[n+1]=t;
 t=at[n];
 at[n]= at[n+1];
 at[n+1]=t;
 t=temp[n];
 temp[n]= temp[n+1];
 temp[n+1]=t;
 t=pri[n];
 pri[n]=pri[n+1];
 pri[n+1]=t;
 stemp= p[n];
 p[n]= p[n+1];
 p[n+1]=stemp;

}
}
}




}
for(i=0;i<s1;i++)
{
    tat[i]=ct[i]-at[i];
    wt[i]= tat[i]-bt[i];
   
}
double avgtat=0.0, avgwt=0.0;
for(i=0;i<s1;i++)
{
    avgtat+=tat[i];
    avgwt+=wt[i];
}
avgtat=avgtat/s1;
avgwt=avgwt/s1;
String s = "Waiting time: ";
for(i=0;i<s1;i++)
{
    s+=p[i]+" : "+ wt[i]+ "|| ";
}
s+="Avg. Waiting time : "+ avgwt+"     "+" Turnaround time : ";
for(i=0;i<s1;i++)
{
    s+=p[i]+" : "+ tat[i]+ "|| ";
}
s+="Avg. Turnaround time : "+ avgtat;
JLabel t2= new JLabel(s);
p26.add(t2);
}
 if (cb3.isSelected())
        { sortbyarrival();
            int x=0,m,n;
        int tt= totaltime;
          
       JTextField gantt3[]= new JTextField[s1];
       JLabel lab7= new JLabel ("Non- Preemptive Shortest Job First");
p17.add(lab7);
         i=0;
         m=0;
           while( ++m<s1 && at[i]== at[m]);
           for(i=0;i<m-1;i++)
{
   for(j=0;j<m-1-i;j++){
       if(bt[j]>bt[j+1])
       {
           
           t=bt[j];
           bt[j]= bt[j+1];
           bt[j+1]=t;
           t=pri[j];
           pri[j]=pri[j+1];
           pri[j+1]=t;
           stemp= p[j];
           p[j]= p[j+1];
           p[j+1]=stemp;
       }
   } 
}
       
i=0;
while(tt!=0)
{
   gantt3[i]= new JTextField(p[i],100/totaltime*bt[i] );
   
    gantt3[i].setHorizontalAlignment(JTextField.CENTER);
    x+=bt[i];
    p18.add(gantt3[i]);
    tt= tt- bt[i];
    tat[i]=x-at[i];
    wt[i]=tat[i]-bt[i];
    
    if(tt!=0){
    j=i;
    while( ++j<s1 && x>=at[j] );
    for(m=i+1;m<j-1;m++)
{
   for(n=i+1;n<j-1;n++){
       if(bt[n]>bt[n+1])
       { 
           t=at[n];
           at[n]= at[n+1];
           at[n+1]=t;
           t=bt[n];
           bt[n]= bt[n+1];
           bt[n+1]=t;
           t=pri[n];
           pri[n]=pri[n+1];
           pri[n+1]=t;
           stemp= p[n];
           p[n]= p[n+1];
           p[n+1]=stemp;
       }
   } 
}
}
    i++;
        }
double avgtat=0.0, avgwt=0.0;
for(i=0;i<s1;i++)
{
    avgtat+=tat[i];
    avgwt+=wt[i];
}
avgtat=avgtat/s1;
avgwt=avgwt/s1;
String s = "Waiting time: ";
for(i=0;i<s1;i++)
{
    s+=p[i]+" : "+ wt[i]+ "|| ";
}
s+="Avg. Waiting time : "+ avgwt+"     "+" Turnaround time : ";
for(i=0;i<s1;i++)
{
    s+=p[i]+" : "+ tat[i]+ "|| ";
}
s+="Avg. Turnaround time : "+ avgtat;
JLabel t3= new JLabel(s);
p27.add(t3);
        }

 if(cb4.isSelected())
{ 
    sortbyarrival();
JTextField gantt4[]= new JTextField[s1];
JLabel lab9= new JLabel ("Round Robin");
p19.add(lab9);
int x=0;
for(i=0;i<s1;i++)
temp[x++]= bt[i];
i=0;
int tt= totaltime;
j=0;
x=0;
while(tt!=0)
{  
    if(temp[i]>=q)
{
   gantt4[i]= new JTextField(p[i],100/totaltime*q );
    x+=q;
   tt-=q;
   temp[i]-=q;
   if(temp[i]==0)
  ct[i]=x;
   gantt4[i].setHorizontalAlignment(JTextField.CENTER);
    p20.add(gantt4[i]);
     j=i;
    while(++j<s1 && at[j]<= x);
    if(i<j-1)
    i++;
    else
        i=0;
} 
else if(temp[i]!=0)
{
    gantt4[i]= new JTextField(p[i],100/totaltime*temp[i]);
     tt-=temp[i];
     temp[i]=0;
     x+=temp[i];
     ct[i]=x;
     gantt4[i].setHorizontalAlignment(JTextField.CENTER);
    p20.add(gantt4[i]);
     j=i;
    while(++j<s1 && at[j]<= x);
    if(i<j-1)
    i++;
    else
        i=0;
    
}
    else
{
    i++;
    if(i>j-1)
        i=0;
    //continue;
}
   
}  
for(i=0;i<s1;i++)
{
    tat[i]=ct[i]-at[i];
    wt[i]= tat[i]-bt[i];
   
}
double avgtat=0.0, avgwt=0.0;
for(i=0;i<s1;i++)
{
    avgtat+=tat[i];
    avgwt+=wt[i];
}
avgtat=avgtat/s1;
avgwt=avgwt/s1;
String s = "Waiting time: ";
for(i=0;i<s1;i++)
{
    s+=p[i]+" : "+ wt[i]+ "|| ";
}
s+="Avg. Waiting time : "+ avgwt+"     "+" Turnaround time : ";
for(i=0;i<s1;i++)
{
    s+=p[i]+" : "+ tat[i]+ "|| ";
}
s+="Avg. Turnaround time : "+ avgtat;
JLabel t4= new JLabel(s);
p28.add(t4);

    } 
 if (cb5.isSelected())
        { sortbyarrival();
         int m,n;
        int tt= totaltime;
        for(i=0;i<s1;i++)
        temp[i]=bt[i];
       JTextField gantt5[]= new JTextField[s1];
       JLabel lab11= new JLabel ("Preemptive priority");
       p21.add(lab11);
         i=0;
         m=0;
           while( ++m<s1 && at[i]== at[m]);
           for(i=0;i<m-1;i++)
{
   for(j=0;j<m-1-i;j++){
       if(pri[j]>pri[j+1])
       {
           t= bt[j];
           bt[j]= bt[j+1];
           bt[j+1]=t;
           t=temp[j];
           temp[j]= temp[j+1];
           temp[j+1]=t;
           t=pri[j];
           pri[j]=pri[j+1];
           pri[j+1]=t;
           stemp= p[j];
           p[j]= p[j+1];
           p[j+1]=stemp;
       }
   } 
}
       
int x=0;
i=0;

while(tt!=0)
{


while(temp[i++]==0);
    i-=1;
tt-=1;
x+=1;
temp[i]-=1;
if(temp[i]==0)
    ct[i]=x;
gantt5[i]= new JTextField(p[i],100/totaltime);
gantt5[i].setHorizontalAlignment(JTextField.CENTER);
    p22.add(gantt5[i]);
j=i;
while(++j<s1 && at[j]<= x);
for(m= i; m< j-1;m++)
{
for(n= i;n< j-1;n++)
{
if(pri[n]>pri[n+1])
{
 t=bt[n];
 bt[n]=bt[n+1];
 bt[n+1]=t;
 t=at[n];
 at[n]= at[n+1];
 at[n+1]=t;
 t=temp[n];
 temp[n]= temp[n+1];
 temp[n+1]=t;
 t=pri[n];
 pri[n]=pri[n+1];
 pri[n+1]=t;
 stemp= p[n]; 
 p[n]= p[n+1];
 p[n+1]=stemp;

}
}
}
}
for(i=0;i<s1;i++)
{
    tat[i]=ct[i]-at[i];
    wt[i]= tat[i]-bt[i];
   
}
double avgtat=0.0, avgwt=0.0;
for(i=0;i<s1;i++)
{
    avgtat+=tat[i];
    avgwt+=wt[i];
}
avgtat=avgtat/s1;
avgwt=avgwt/s1;
String s = "Waiting time: ";
for(i=0;i<s1;i++)
{
    s+=p[i]+" : "+ wt[i]+ "|| ";
}
s+="Avg. Waiting time : "+ avgwt+"     "+" Turnaround time : ";
for(i=0;i<s1;i++)
{
    s+=p[i]+" : "+ tat[i]+ "|| ";
}
s+="Avg. Turnaround time : "+ avgtat;
JLabel t5= new JLabel(s);
p29.add(t5);

        }
 
 if (cb6.isSelected())
        { int m,n;
        int tt= totaltime;
         sortbyarrival(); 
       JTextField gantt6[]= new JTextField[s1];
       JLabel lab8= new JLabel ("Non- Preemptive Priority");
p23.add(lab8);
         i=0;
         m=0;
           while( ++m<s1 && at[i]== at[m]);
           for(i=0;i<m-1;i++)
{
   for(j=0;j<m-1-i;j++){
       if(pri[j]>pri[j+1])
       {
           t=at[j];
           at[j]=at[j+1];
           at[j+1]=t;
           t=bt[j];
           bt[j]= bt[j+1];
           bt[j+1]=t;
           t=pri[j];
           pri[j]=pri[j+1];
           pri[j+1]=t;
           stemp= p[j];
           p[j]= p[j+1];
           p[j+1]=stemp;
       }
   } 
}
       
i=0;
int x=0;
while(tt!=0)
{
   gantt6[i]= new JTextField(p[i],100/totaltime*bt[i] );
   
    gantt6[i].setHorizontalAlignment(JTextField.CENTER);
    x+=bt[i];
    ct[i]=x;
    p24.add(gantt6[i]);
    tt= tt- bt[i];
    if(tt!=0){
    j=i;
    while( ++j<s1 && x>=at[j] );
    for(m=i+1;m<j-1;m++)
{
   for(n=i+1;n<j-1;n++){
       if(pri[n]>pri[n+1])
       { 
           t=at[n];
           at[n]= at[n+1];
           at[n+1]=t;
           t=bt[n];
           bt[n]= bt[n+1];
           bt[n+1]=t;
           t=pri[n];
           pri[n]=pri[n+1];
           pri[n+1]=t;
           stemp= p[n];
           p[n]= p[n+1];
           p[n+1]=stemp;
       }
   } 
}
}
    i++;
        }
for(i=0;i<s1;i++)
{
    tat[i]=ct[i]-at[i];
    wt[i]= tat[i]-bt[i];
   
}
double avgtat=0.0, avgwt=0.0;
for(i=0;i<s1;i++)
{
    avgtat+=tat[i];
    avgwt+=wt[i];
}
avgtat=avgtat/s1;
avgwt=avgwt/s1;
String s = "Waiting time: ";
for(i=0;i<s1;i++)
{
    s+=p[i]+" : "+ wt[i]+ "|| ";
}
s+="Avg. Waiting time : "+ avgwt+"     "+" Turnaround time : ";
for(i=0;i<s1;i++)
{
    s+=p[i]+" : "+ tat[i]+ "|| ";
}
s+="Avg. Turnaround time : "+ avgtat;
JLabel t6= new JLabel(s);
p30.add(t6);
        }
 f2.add(p13);
 f2.add(p14);
 f2.add(p31);
 f2.add(p25);
 f2.add(p15);
 f2.add(p16);
 f2.add(p26);
 f2.add(p17);
 f2.add(p18);
 f2.add(p27);
 f2.add(p19);
 f2.add(p20);
 f2.add(p28);
 f2.add(p21);
 f2.add(p22);
 f2.add(p29);
 f2.add(p23);
 f2.add(p24);
 f2.add(p30);
    }
}
           

