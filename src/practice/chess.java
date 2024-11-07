//#include<stdio.h>
//int i, j, c[8][8]={0}, m1, m2, t1, t2, p1, p2, ch=1,cm=1,x,chk=1,k1=7,k2=3,k3=0,k4=4;
//    int start(int x)
//    {
//    printf("\n");
//    for(i=0;i<8;i++)
//    {
//        for(j=0;j<8;j++)
//        {
//            if(c[i][j]==0)
//            {
//                printf("\033[0;33m-  ");
//            }
//            else if(c[i][j]>=65 && c[i][j]<=90){
//            printf("\033[0;31m%c  ",c[i][j]);
//            printf("\033[0m");}
//            else
//            {printf("\033[0;32m%c  ",c[i][j]);
//            printf("\033[0m");}
//        }
//        printf("\n");
//    }
//    return 0;
//    }   
//    int cheack_mate()
//    {
//        printf("\nIts cheack mate:\n");
//        cm=0;
//    }
//    void pawn_move()
//    {
//            if(c[p1][p2]==107 || c[p1][p2]==75)
//            cheack_mate();
//            else
//            {
//            t1=c[m1][m2];
//            t2=c[p1][p2];
//            c[m1][m2]=t2;
//            c[p1][p2]=t1;
//            }
//    }
//    void pawn_catch()
//    {
//        if(c[p1][p2]==107 || c[p1][p2]==75)
//        {printf("\npawn move cheacked=1\n");
//        cheack_mate();
//        }
//        else 
//        {
//        c[p1][p2]=c[m1][m2];
//        c[m1][m2]=0;
//        }
//        start(x);
//    }
//    void pawn_cheack()
//    {
//        if(c[m1][m2]==112)
//        {
//            if(p1>m1 && m2==p2)
//            {
//                if(c[p1][p2]==0)
//                pawn_move();
//                
//            }
//            else if(p1>m1 && (m2==p2+1 ||m2==p2-1))
//            {
//                if(c[p1][p2]>=65 && c[p1][p2]<=90)
//                {
//                printf("\ncross move valid:1\n");
//                pawn_catch();
//                }
//            }
//            else
//            {
//                printf("\nCan not move your side:\n");
//            }
//            start(x);
//        }
//        else if(c[m1][m2]==80)
//        {
//            
//            if(p1>=(m1-2) && m2==p2)
//            {
//                if(c[p1][p2]==0)
//                pawn_move();
//            }
//            else if(p1==m1-1 && (m2==p2-1 || m2==p2+1))
//            {   
//                if(c[p1][p2]>=97 && c[p1][p2]<=122)
//                {
//                pawn_catch();
//                }
//            }
//            else
//            {
//                printf("\nCan not move your side:\n");
//            }
//            start(x);
//        }
//    }
//    void rook_move()
//    {
//        if(c[p1][p2]==107 || c[p1][p2]==75)
//        cheack_mate();
//        else
//        {
//        t1=c[m1][m2];
//        t2=c[p1][p2];
//        c[m1][m2]=t2;
//        c[p1][p2]=t1;
//        }
//    }
//    void rook_catch(int x,int y)
//    {
//            if(c[m1][m2]==104)
//            {
//                if(c[x][y]>=65 && c[x][y]<=90)
//                {
//                if(c[x][y]==107 || c[x][y]==75)
//                cheack_mate();
//                c[x][y]=c[m1][m2];
//                c[m1][m2]=0;
//                
//                }
//            }
//            else if(c[m1][m2]==72)
//            {
//                if(c[x][y]>=97 && c[x][y]<=122)
//                {
//                if(c[x][y]==107 || c[x][y]==75)
//                cheack_mate();
//                c[x][y]=c[m1][m2];
//                c[m1][m2]=0;
//                }
//            }
//    }
//    void rook_cheack()
//    {
//        int valid=1,temp[1][1];
//            if(m2==p2)
//            {
//                if(m1<p1)
//                {
//                    for(i=m1+1;i<=p1;i++)
//                    {
//                        if(c[i][m2]!=0)
//                        {valid=0;
//                        rook_catch(i,m2);
//                        }
//                    }
//                }
//                else if(m1>p1)
//                {
//                    for(i=m1-1;i>=p1;i--)
//                    {
//                        if(c[i][m2]!=0)
//                        {
//                            valid=0;
//                            rook_catch(i,m2);
//                        }
//                    }
//                }
//            }
//            else if(m1==p1)
//            {
//                if(m2<p2)
//                {
//                    for(i=m2+1;i<=p2;i++)
//                    {
//                        if(c[m1][i]!=0)
//                        {
//                            valid=0;
//                            printf("\ncheack\n");
//                            rook_catch(m1,i);
//                        }
//                    }
//                }
//                else if(m2>p2)
//                {
//                    for(i=m2-1;i>=p2;i--)
//                    {
//                        if(c[m1][i]!=0)
//                        {
//                            valid=0;
//                            rook_catch(m1,i);
//                        }
//                    }
//                }
//            }
//                if(valid)
//                rook_move();
//            start(x);
//    }
//    void knight_move()
//    {
//        if(c[p1][p2]==107 || c[p1][p2]==75)
//        cheack_mate();
//        else if(c[p1][p2]==0)
//        {
//            t1=c[m1][m2];
//            t2=c[p1][p2];
//            c[m1][m2]=t2;
//            c[p1][p2]=t1;
//        }
//    }
//    void knight_catch()
//    {
//        if(c[p1][p2]==107 || c[p1][p2]==75)
//        cheack_mate();
//        c[p1][p2]=c[m1][m2];
//        c[m1][m2]=0;
//        
//    }
//    void knight_cheack()
//    {
//        int kn=1;
//        if(m1==p1-1 || m1==p1+1)
//        {
//            if(m2-2==p2 || m2+2==p2)
//            {
//                printf("\nHorizontaly:\n");
//                knight_move();
//            }
//            else
//            kn=0;
//        }
//        else if(m2==p2-1 || m2==p2+1)
//        {
//            if(m1-2==p1 || m1+2==p1)
//            {
//                printf("\nVertivaly:\n");
//                knight_move();
//            }
//            else
//            kn=0;
//        }
//        if(kn)
//        {
//            if(c[m1][m2]==103)
//            {
//            if(c[p1][p2]>=65 && c[p1][p2]<=90)
//            {
//                knight_catch();
//            }
//            }
//            else if(c[m1][m2]==71)
//            {
//               if(c[p1][p2]>=97 && c[p1][p2]<=122)
//                {
//                    knight_catch();
//                } 
//            }
//        }
//        start(x);
//    }
//    void king_move()
//    {
//        if(c[p1][p2]==107 || c[p1][p2]==75)
//        cheack_mate();
//        else
//        {
//        t1=c[m1][m2];
//        t2=c[p1][p2];
//        c[m1][m2]=t2;
//        c[p1][p2]=t1;
//        if(c[p1][p2]==75)
//        k1=p1,k2=p2;
//        if(c[p1][p2]==107)
//        k3=p1,k4=p2;
//        }
//    }
//    void king_catch()
//    {
//        if(c[m1][m2]==107)
//        {
//        if(c[p1][p2]>=65 && c[p1][p2]<=90)
//        {
//        if(c[p1][p2]==107 || c[p1][p2]==75)
//        cheack_mate();
//        c[p1][p2]=c[m1][m2];
//        c[m1][m2]=0;
//        }
//        }
//        else if(c[m1][m2]==75)
//        {
//            if(c[p1][p2]>=97 && c[p1][p2]<=122)
//            {
//                if(c[p1][p2]==107 || c[p1][p2]==75)
//                cheack_mate();
//                c[p1][p2]=c[m1][m2];
//                c[m1][m2]=0;
//            }
//        }
//        
//    }
//    void king_cheack()
//    {
//        if(c[p1][p2]==0)
//        {
//        if(m2==p2 && (m1==p1+1 || m1==p1-1))
//        {
//            printf("\nKing detected:\n");
//            if(c[m1][m2]!=0)
//            king_catch();
//            king_move();
//        }
//        else if(m1==p1 && (m2==p2-1 || m2==p2+1))
//        {
//            printf("\nKing detected:\n");
//            if(c[m1][m2]!=0)
//            king_catch();
//            king_move();
//        }
//        else if((m1==p1-1 && m2==p2-1) || (m1==p1+1 && m2==p2+1))
//        {
//            printf("\nKing detected:\n");
//            if(c[m1][m2]!=0)
//            king_catch();
//            king_move();
//        }
//        else if((m1==p1+1 && m2==p2-1) || (m1==p1-1 && m2==p2+1))
//        {
//            printf("\nKing detected:\n");
//            if(c[m1][m2]!=0)
//            king_catch();
//            king_move();
//        }
//        }
//        start(x);
//    }
//    void bishop_move()
//    {
//        if(c[p1][p2]==107 || c[p1][p2]==75)
//        cheack_mate();
//        else
//        {
//        t1=c[m1][m2];
//        t2=c[p1][p2];
//        c[m1][m2]=t2;
//        c[p1][p2]=t1;
//        }
//    }
//    void bishop_catch(int x,int y)
//    {
//        if(c[m1][m2]==117)
//        {
//            if(c[p1][p2]>=65 && c[p1][2]<=90)
//            {
//                if(c[p1][p2]==107 || c[p1][p2]==75)
//                cheack_mate();
//                c[p1][p2]=c[m1][m2];
//                c[m1][m2]=0;
//            }
//        }
//        else if(c[m1][m2]==85)
//        {
//            if(c[p1][p2]>=97 && c[p1][p2]<=90)
//            {
//                if(c[p1][p2]==107 || c[p1][p2]==75)
//                cheack_mate();
//                c[p1][p2]=c[m1][m2];
//                c[m1][m2]=0;
//            }
//        }  
//    }
//    void bishop_cheack()
//    {
//        int bm=0,z=0;
//        if(m1<p1 && m2<p2)
//        {
//            printf("\nmoving to 1:\n");
//            for(i=m1+1,j=m2+1;i<=p1,j<=p2;i++,j++,z++)
//            {
//                if(c[i][j]!=0)
//                {
//                    bm++;
//                    bishop_catch(i,j);
//                }
//            }
//            if(c[m1][m2]==c[p1+z][p2+z] && bm)
//            bishop_move();
//        }
//        else if(m1>p1 && m2>p2)
//        {
//            printf("\nmoving to 2:\n");
//            for(i=m1-1,j=m2-1;i>=p1,j>=p2;i--,j--,z++)
//            {
//                if(c[i][j]!=0)
//                {
//                    bm++;
//                    bishop_catch(i,j);
//                }
//            }
//            if(c[m1][m2]==c[p1-z][p2-z] && bm)
//            bishop_move();
//        }
//        else if(m1<p1 && m2>p2)
//        {
//            printf("\nmoving to 3:\n");
//            for(i=m1+1,j=m2-1;i<=p1,j>=p2;i++,j--,z++)
//            {
//                if(c[i][j]!=0)
//                {
//                    bm++;
//                    bishop_catch(i,j);
//                }
//            }
//            if(c[m1][m2]==c[p1+z][p2-z] && bm)
//            bishop_move();
//        }
//        else if(m1>p1 && m2<p2)
//        {
//            printf("\nmoving to 4:\n");
//            for(i=m1-1,j=m2+1;i>=p1,j<=p2;i--,j++,z++)
//            {
//                if(c[i][j]!=0)
//                {
//                    bm++;
//                    bishop_catch(i,j);
//                }
//            }
//            if(c[m1][m2]==c[p1-z][p2+z] && bm)
//            bishop_move();
//        }
//        start(x);
//    }
//    void queen_move()
//    {
//        if(c[p1][p2]==107 || c[p1][p2]==75)
//        cheack_mate();
//        else if(c[p1][p2]==0)
//        {
//        t1=c[m1][m2];
//        t2=c[p1][p2];
//
//        c[m1][m2]=t2;
//        c[p1][p2]=t1;
//        }
//    }
//    void queen_catch(int x,int y)
//    {
//        if(c[m1][m2]==113)
//        {
//            if(c[x][y]>=65 && c[x][y]<=90)
//            {
//                if(c[x][y]==107 || c[x][y]==75)
//                cheack_mate();
//                c[x][y]=c[m1][m2];
//                c[m1][m2]=0;
//            }
//        }
//        else if(c[m1][m2]==81)
//        {
//            if(c[x][y]>=97 && c[x][y]<=122)
//            {
//                if(c[x][y]==107 || c[x][y]==75)
//                cheack_mate();
//                c[x][y]=c[m1][m2];
//                c[m1][m2]=0;
//            }
//        }
//        
//    }
//    void queen_cheack()
//    {
//        int qm=1,true=0,z=0,n=1;
//        if(m1<p1 && m2<p2)
//        {
//            for(i=m1+1,j=m2+1;i<=p1,j<=p2;i++,j++,z++)
//            {
//                if(c[i][j]!=0)
//                {
//                    qm=0;
//                    queen_catch(i,j);
//                } 
//            }
//            if(c[m1][m2]==c[p1-z][p2-z] && qm)
//            {
//                queen_move();
//            }
//        }
//        else if(m1>p1 && m2>p2)
//        {
//            for(i=m1-1,j=m2-1,z=0;i>=p1,j>=p2;i--,j--,z++)
//            {
//                if(c[i][j]!=0)
//                {
//                    qm=0;
//                    queen_catch(i,j);
//                }
//            }
//            if(c[m1][m2]==c[p1+z][p2+z]&&qm)
//            {
//                queen_move();
//            }
//        }
//        else if(m1<p1 && m2>p2)
//        {
//            for(i=m1+1,j=m2-1;i<=p1,j>=p2;i++,j--,z++)
//            {
//                if(c[i][j]!=0)
//                {
//                    qm=0;
//                    queen_catch(i,j);
//                }
//            }if(c[m1][m2]==c[p1-z][p2+z]&&qm)
//            {
//                queen_move();
//            }
//        }
//        else if(m1>p1 && m2<p2)
//        {
//            for(i=m1-1,j=m2+1;i>=p1,j<=p2;i--,j++,z++)
//            {
//                if(c[i][j]!=0)
//                {
//                    qm=0;
//                    queen_catch(i,j);
//                }
//            }if(c[m1][m2]==c[p1+z][p2-z] && qm)
//            {
//                queen_move();
//            }
//        }
//        if(m2==p2 || m1==p1)
//        {
//        if(m2==p2)
//            {
//                if(m1<p1)
//                {
//                    for(i=m1+1;i<=p1;i++)
//                    {
//                        if(c[i][m2]!=0)
//                        {
//                            qm=0;
//                        queen_catch(i,m2);
//                        }
//                    }
//                }
//                else if(m1>p1)
//                {
//                    for(i=m1-1;i>=p1;i--)
//                    {
//                        if(c[i][m2]!=0)
//                        {
//                            qm=0;
//                        queen_catch(i,m2);
//                        }
//                    }
//                }
//            }
//            else if(m1==p1)
//            {
//                if(m2<p2)
//                {
//                    for(i=m2+1;i<=p2;i++)
//                    {
//                        if(c[m1][i]!=0)
//                        {
//                            qm=0;
//                        queen_catch(m1,i);
//                        }
//                    }
//                }
//                else if(m2>p2)
//                {
//                    for(i=m2-1;i>=p2;i--)
//                    {
//                        if(c[m1][i]!=0)
//                        {qm=0;
//                        queen_catch(m1,i);
//                        }
//                    }
//                }
//            }
//            if(qm)
//            queen_move();
//        }
//        start(x);   
//    }
//    int cheack()
//    {
//        int z=0,cp=1;
//        printf("\nk1=%d k2=%d k3=%d k4=%d\n",k1,k2,k3,k4);
//        if(c[k1][k2]==75)//capital king rook cheacks
//        {
//        for(i=k2+1;i<=7;i++)
//        {//Right side cheackingpr
//            if((c[k1][i]>=97 && c[k1][i]<=122))
//            {
//                if(c[k1][i]==(113||104))
//                {   
//                    printf("\nCheack\n");
//                    break;
//                }
//            }
//            if(c[k1][i]!=0)
//            break;
//        }
//        for(i=k2-1;i>=0;i--)
//        {//left side cheacking
//            if((c[k1][i]>=97 && c[k1][i]<=122))
//            {
//                if(c[k1][i]==(113||104))
//                {   
//                    printf("\nCheack\n");
//                    break;
//                }
//            }
//            if(c[k1][i]!=0)
//            break;
//        }
//        for(i=k1+1;i>=0;i++)
//        {//front side cheacking
//            if((c[i][k2]>=97 && c[i][k2]<=122))
//            {
//                if(c[i][k2]==(113||104))
//                {   
//                    printf("\nCheack\n");
//                    break;
//                }
//            }
//            if(c[i][k2]!=0)
//            break;
//        }
//        for(i=k1-1;i<=7;i--)
//        {//back side cheacking
//            if((c[i][k2]>=97 && c[i][k2]<=122))
//            {
//                if(c[i][k2]==(113||104))
//                {   
//                    printf("\nCheack\n");
//                    break;
//                }
//            }
//            if(c[i][k2]!=0)
//            break;
//        }
//        }
//        if(c[k3][k4]==107)//small king rook cheacks
//        {
//        for(i=k4+1;i<=7;i++)
//        {//Right side cheacking
//            if((c[k3][i]>=65 && c[k3][i]<=90))
//            {
//                if(c[k3][i]==(81||72))
//                {   
//                    printf("\nCheack\n");
//                    break;
//                }
//            }
//            if(c[k3][i]!=0)
//            break;
//        }
//        for(i=k4-1;i>=0;i--)
//        {//left side cheacking
//            if((c[k3][i]>=65 && c[k3][i]<=90))
//            {
//                if(c[k3][i]==(81||72))
//                {   
//                    printf("\nCheack\n");
//                    break;
//                }
//            }
//            if(c[k3][i]!=0)
//            break;
//        }
//        for(i=k3+1;i<=7;i++)
//        {//front side cheacking
//            if((c[i][k4]>=65 && c[i][k4]<=90))
//            {
//                if(c[i][k4]==(81||72))
//                {   
//                    printf("\nCheack\n");
//                    break;
//                }
//            }
//            if(c[i][k4]!=0)
//            break;
//        }
//        for(i=k3-1;i>=0;i--)
//        {//back side cheacking
//            if((c[i][k4]>=65 && c[i][k4]<=90))
//            {
//                if(c[i][k4]==(81||72))
//                {   
//                    printf("\nCheack\n");
//                    break;
//                }
//            }
//            if(c[i][k4]!=0)
//            break;
//        }
//        }
//        
//    }
//
//int main()
//{
//    int pawn[2][8]={1},t[1][1];
//    int n=8,cnt,u=0;
//    for(i=0;i<n;i++)
//    {
//    c[1][i]=112;
//    c[6][i]=80;
//    }
//    c[0][0]=c[0][7]=104;
//    c[0][1]=c[0][6]=103;
//    c[0][2]=c[0][5]=117;
//    c[0][3]=113,c[0][4]=107;
//    c[7][0]=c[7][7]=72;
//    c[7][1]=c[7][6]=71;
//    c[7][2]=c[7][5]=85;
//    c[7][3]=75,c[7][4]=81;
//
//    start(x);
//    while(ch)
//    {
//    // printf("\nWant to continue no=0:");
//    // scanf("%d",&ch);
//    // if(ch==0)
//    // return 0;
//    cheack();
//    if(cm==0)
//    return 0;
//    printf("\nEnter position (i&j):");
//    scanf("%d%d",&m1,&m2);
//    printf("\nEnter moving position (i&j):");
//    scanf("%d%d",&p1,&p2);
//    if((m1>7 || m1<0) || (m2>7 || m2<0))
//    {
//        printf("\nEnter valid choice:\n");
//    }
//    else
//    {
//        if((c[m1][m2]==112 || c[m1][m2]==80))
//        {
//            printf("\nPawn cheack:\n");
//            pawn_cheack();
//        }
//        else if((m1==p1 || m2==p2) && (c[m1][m2]==104 || c[m1][m2]==72))
//        {
//            rook_cheack();
//        }
//        else if(c[m1][m2]==103 || c[m1][m2]==71)
//        {
//            knight_cheack();
//        }
//        else if(c[m1][m2]==107 ||c[m1][m2]==75)
//        {
//            king_cheack();
//        }
//        else if(c[m1][m2]==117 || c[m1][m2]==85)
//        {
//            bishop_cheack();
//        }
//        else if(c[m1][m2]==113 || c[m1][m2]==81)
//        {
//            queen_cheack();
//        }
//    }
//    }
//}
//
//// h  g  u  q  k  u  g  h  
//// p  p  p  p  p  p  p  p  
//// -  -  -  -  -  -  -  -  
//// -  -  -  -  -  -  -  -  
//// -  -  -  -  -  -  -  -  
//// -  -  -  -  -  -  -  -  
//// P  P  P  P  P  P  P  P  
//// H  G  U  K  Q  U  G  H
//
//// 00 01 02 03 04 05 06 07
//// 10 11 12 13 14 15 16 17
//// 20 21 22 23 24 25 26 27
//// 30 31 32 33 34 35 36 37
//// 40 41 42 43 44 45 46 47
//// 50 51 52 53 54 55 56 57
//// 60 61 62 63 64 65 66 67
//// 70 71 72 73 74 75 76 77