/*
# -*- coding: utf-8 -*-
# @Author: Priyanshu Gandhi
# @Date:   2017-07-26
# @Email:  gandhi.priyanshu@gmail.com
# @Github username: @priyanshugandhi
# MIT License. You can find a copy of the License
*/




import java.util.*;
import java.lang.*;

class Codechef
{
    public static void main(String args[]) throws NullPointerException
    {
        int n,m,i,j,k;
        System.out.print("\n\n\n\n\n");
        System.out.print("\t\t\t"+"FOOTBALL LEAGUE TABLE"+"\t\t");
        System.out.print("\n\n");
        System.out.print("\t\t\t\t\t"+"- BY PRIYANSHU GANDHI");
        int x=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\n");
        System.out.println("Enter number of Teams:");
        n=sc.nextInt();
        String z[]=new String[n];
        System.out.println("\n\n");
        System.out.println("Enter names of Teams:");                                                                   
        for(i=0;i<n;i++)
        {
            z[i]=sc.next();
        }
        System.out.println("\n\n");
        System.out.println("Enter number of Matches:"); 
        m=sc.nextInt();
        int pt[]=new int[n];
        int gf[]=new int[n];
        int ga[]=new int[n];
        int gd[]=new int[n];
        int mt[]=new int[n];
        String s[]=new String[n+n];
        String a[][]=new String[m][4];
        System.out.println("\n\n");
        System.out.println("Enter details of Matches(Team1 Team2 T1goals T2goals)"); 
        for(i=0;i<m;i++)
        {
            for(j=0;j<4;j++)
            {
                a[i][j]=sc.next();
            }
            System.out.println();
        }
        
        for(i=0;i<m;i++)
        {
            for(j=0;j<2;j++)
            {k=0;
                int temp=0;
                int index=0;
                while(((i-k)>=0)&&(i>0))
                {
                    if(a[i][j].equals(s[i-k]))
                    {temp=1;
                        index=i-k;
                    }
                    k++;
                }
                
                if(temp==1)
                {mt[index]+=1;
                    gf[index]+=Integer.parseInt(a[i][(j+2)]);
                    ga[index]+=Integer.parseInt(a[i][(3-j)]);
                    if((Integer.parseInt(a[i][j+2]))>(Integer.parseInt(a[i][3-j])))
                    pt[index]+=2;
                    else if(Integer.parseInt(a[i][j+2])==Integer.parseInt(a[i][3-j]))
                    pt[index]+=1;
                    else
                    {pt[index]+=0;}
                }
                else
                {
                    s[x]=a[i][j];
                    mt[x]+=1;
                    gf[x]=Integer.parseInt(a[i][(j+2)]);
                    ga[x]=Integer.parseInt(a[i][(3-j)]);
                    if((Integer.parseInt(a[i][j+2]))>(Integer.parseInt(a[i][3-j])))
                    pt[x]=2;
                    else if(Integer.parseInt(a[i][j+2])==Integer.parseInt(a[i][3-j]))
                    pt[x]=1;
                    else
                    {pt[x]=0;}
                    x++;
                }
            }
        }
        int v=m;
        
        int p[]=new int[n];
        
        
        for(i=0;i<m;i++)
        { gd[i]=gf[i]-ga[i];
            p[i]=pt[i];
        }
        
        
        int g[]=new int[n];
        int b;
        int r[]=new int[n];
        
        
        for(i=0;i<m;++i)
        {
            for(j=0;j<(m-i-1);++j)
            if(p[j]<p[j+1])
            {
                b=p[j];
                p[j]=p[j+1];
                p[j+1]=b;
            }
        }
        
        int mp[]=new int[n];
        int goalf[]=new int[n];
        int goala[]=new int[n];
        String tn[]=new String[n+n];
        
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            { if(pt[i]==p[j])
                {tn[j]=s[i];
                    mp[j]=mt[i];
                    goalf[j]=gf[i];
                    goala[j]=ga[i];
                    g[j]=gd[i];
                }
            }
        }
        
        
        for(i=m;i<n;i++)
        {
            mp[i]=0;
            goalf[i]=0;
            goala[i]=0;
            g[i]=0;
            p[i]=0;
        }
        
        
        for(i=0;i<n;i++)
        {for(j=0;j<m;j++)
            { if((z[i].equals(tn[j])))
                {z[i]="0";
                }
                
            }
        }
        
        for(i=0;i<n;i++)
        {
            if(z[i]!="0")
            {tn[v]=z[i];
                v++;
            }
        }
        
        for(i=0;i<n;i++)
        {
            if(p[i]==p[i+1])
            { if(g[i]>g[i+1])
                {r[i]=i+1;
                    r[i+1]=i+2;
                    i=i+1;
                }
                else if(g[i]<g[i+1])
                {r[i+1]=i+1;
                    r[i]=i+2;
                    i=i+1;
                }
                else
                {
                    
                    try
                    {
                        int d=tn[i].compareToIgnoreCase(tn[i+1]);
                        if(d>0)
                        { s[i]=tn[i];
                            tn[i]=tn[i+1];
                            tn[i+1]=s[i];
                        }
                    }
                    catch(NullPointerException npe)
                    {  npe.printStackTrace();
                    }
                    r[i]=i+1;
                    r[i+1]=i+1;
                    i=i+1;
                }
            }
            else
                r[i]=i+1;
        }
        
         System.out.print("\n\n\n\n\n");
         System.out.print("\t\t\t"+"Football Points Table"+"\t\t");
         System.out.print("\n\n");






        System.out.println("Name"+"\t\t"+"Match"+"\t"+"GoalF"+"\t"+"GoalA"+"\t"+"GD"+"\t"+"Points"+"\t"+"Rank");
        
        for(i=0;i<n;i++)
        {
            System.out.println(tn[i]+"\t\t"+mp[i]+"\t"+goalf[i]+"\t"+goala[i]+"\t"+g[i]+"\t"+p[i]+"\t"+r[i]);
        }
        
    }
}