package practice;
import java.util.*;

public class ChessBoard {
    static int i, j, c[][] = new int[8][8], m1, m2, t1, t2, p1, p2, cm = 1, x, chk = 1, k1 = 7, k2 = 3, k3 = 0, k4 = 4;
	static boolean ch = true;

    public static int start(int x) {
        System.out.println();
        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {
                if (c[i][j] == 0) {
                    System.out.print("\033[0;33m-  ");
                } else if (c[i][j] >= 65 && c[i][j] <= 90) {
                    System.out.print("\033[0;31m" + (char) c[i][j] + "  ");
                    System.out.print("\033[0m");
                } else {
                    System.out.print("\033[0;32m" + (char) c[i][j] + "  ");
                    System.out.print("\033[0m");
                }
            }
            System.out.println();
        }
        return 0;
    }

    public static int checkMate() {
        System.out.println("\nIts check mate:");
        cm = 0;
        return cm;
    }
public void pawnMove() {
    if (c[p1][p2] == 107 || c[p1][p2] == 75) {
        checkMate();
    } else {
        int t1 = c[m1][m2];
        int t2 = c[p1][p2];
        c[m1][m2] = t2;
        c[p1][p2] = t1;
    }
}

public void pawnCatch1() {
    if (c[p1][p2] == 107 || c[p1][p2] == 75) {
        System.out.println("pawn move checked=1");
        checkMate();
    } else {
        c[p1][p2] = c[m1][m2];
        c[m1][m2] = 0;
    }
    start(x);
}

public void pawnCheck() {
    if (c[m1][m2] == 112) {
        if (p1 > m1 && m2 == p2) {
            if (c[p1][p2] == 0) {
                pawnMove();
            }
        } else if (p1 > m1 && (m2 == p2 + 1 || m2 == p2 - 1)) {
            if (c[p1][p2] >= 65 && c[p1][p2] <= 90) {
                System.out.println("cross move valid:1");
                pawnCatch1();
            }
        } else {
            System.out.println("Can not move your side:");
        }
        start(x);
    } else if (c[m1][m2] == 80) {
        if (p1 >= (m1 - 2) && m2 == p2) {
            if (c[p1][p2] == 0) {
                pawnMove();
            }
        } else if (p1 == m1 - 1 && (m2 == p2 - 1 || m2 == p2 + 1)) {
            if (c[p1][p2] >= 97 && c[p1][p2] <= 122) {
                pawnCatch1();
            }
        }
    }
}
public void pawnCatch() {
}

else {
System.out.println("\nCan not move your side:\n");
}
void start(x);
}
}
public void rookMove() {
if (c[p1][p2] == 107 || c[p1][p2] == 75) {
    checkMate();
} else {
    t1 = c[m1][m2];
    t2 = c[p1][p2];
    c[m1][m2] = t2;
    c[p1][p2] = t1;
}
}
public void rookCatch(int x, int y) {
if (c[m1][m2] == 104) {
    if (c[x][y] >= 65 && c[x][y] <= 90) {
        if (c[x][y] == 107 || c[x][y] == 75) {
            checkMate();
        }
        c[x][y] = c[m1][m2];
        c[m1][m2] = 0;
    }
} else if (c[m1][m2] == 72) {
    if (c[x][y] >= 97 && c[x][y] <= 122) {
        if (c[x][y] == 107 || c[x][y] == 75) {
            checkMate();
        }
        c[x][y] = c[m1][m2];
        c[m1][m2] = 0;
    }
}
}
public void rookCheck() {
int valid = 1;
int[][] temp = new int[1][1];
if (m2 == p2) {
    if (m1 < p1) {
        for (i = m1 + 1; i <= p1; i++) {
            if (c[i][m2] != 0) {
                valid = 0;
                rookCatch(i, m2);
            }
        }
    } else if (m1 > p1) {
        for (i = m1 - 1; i >= p1; i--) {
            if (c[i][m2] != 0) {
                valid = 0;
                rookCatch(i, m2);
            }
        }
    }
} else if (m1 == p1) {
    if (m2 < p2) {
        for (i = m2 + 1; i <= p2; i++) {
            if (c[m1][i] != 0) {
                valid = 0;
                System.out.println("\ncheack\n");
                rookCatch(m1, i);
            }
        }
    } else if (m2 > p2) {
        for (i = m2 - 1; i >= p2; i--) {
            if (c[m1][i] != 0) {
                valid = 0;
                rookCatch(m1, i);
            }
        }
    }
}
if (valid==1) {
    rookMove();
}
start(x);
}
public void knightMove() {
    if (c[p1][p2] == 107 || c[p1][p2] == 75)
        checkMate();
    else if (c[p1][p2] == 0) {
        t1 = c[m1][m2];
        t2 = c[p1][p2];
        c[m1][m2] = t2;
        c[p1][p2] = t1;
    }
}

public void knightCatch() {
    if (c[p1][p2] == 107 || c[p1][p2] == 75)
        checkMate();
    c[p1][p2] = c[m1][m2];
    c[m1][m2] = 0;
}

public void knightCheck() {
    int kn = 1;
    if (m1 == p1 - 1 || m1 == p1 + 1) {
        if (m2 - 2 == p2 || m2 + 2 == p2) {
            System.out.println("\nHorizontaly:\n");
            knightMove();
        } else
            kn = 0;
    } else if (m2 == p2 - 1 || m2 == p2 + 1) {
        if (m1 - 2 == p1 || m1 + 2 == p1) {
            System.out.println("\nVertivaly:\n");
            knightMove();
        } else
            kn = 0;
    }
    if (kn==1) {
        if (c[m1][m2] == 103) {
            if (c[p1][p2] >= 65 && c[p1][p2] <= 90) {
                knightCatch();
            }
        } else if (c[m1][m2] == 71) {
            if (c[p1][p2] >= 97 && c[p1][p2] <= 122) {
                knightCatch();
            }
        }
    }
    start(x);
}

public void kingMove() {
    if (c[p1][p2] == 107 || c[p1][p2] == 75)
        checkMate();
    else {
        t1 = c[m1][m2];
        t2 = c[p1][p2];
        c[m1][m2] = t2;
        c[p1][p2] = t1;
        if (c[p1][p2] == 75)
            k1 = p1;
        k2 = p2;
        if (c[p1][p2] == 107)
            k3 = p1;
        k4 = p2;
    }
}
public void kingCatch() {
    if (c[m1][m2] == 107) {
        if (c[p1][p2] >= 65 && c[p1][p2] <= 90) {
            if (c[p1][p2] == 107 || c[p1][p2] == 75) {
                checkMate();
            }
            c[p1][p2] = c[m1][m2];
            c[m1][m2] = 0;
        }
    } else if (c[m1][m2] == 75) {
        if (c[p1][p2] >= 97 && c[p1][p2] <= 122) {
            if (c[p1][p2] == 107 || c[p1][p2] == 75) {
                checkMate();
            }
            c[p1][p2] = c[m1][m2];
            c[m1][m2] = 0;
        }
    }
}

public void kingCheck() {
    if (c[p1][p2] == 0) {
        if (m2 == p2 && (m1 == p1 + 1 || m1 == p1 - 1)) {
            System.out.println("\nKing detected:");
            if (c[m1][m2] != 0) {
                kingCatch();
            }
            kingMove();
        } else if (m1 == p1 && (m2 == p2 - 1 || m2 == p2 + 1)) {
            System.out.println("\nKing detected:");
            if (c[m1][m2] != 0) {
                kingCatch();
            }
            kingMove();
        } else if ((m1 == p1 - 1 && m2 == p2 - 1) || (m1 == p1 + 1 && m2 == p2 + 1)) {
            System.out.println("\nKing detected:");
            if (c[m1][m2] != 0) {
                kingCatch();
            }
            kingMove();
        } else if ((m1 == p1 + 1 && m2 == p2 - 1) || (m1 == p1 - 1 && m2 == p2 + 1)) {
            System.out.println("\nKing detected:");
            if (c[m1][m2] != 0) {
                kingCatch();
            }
            kingMove();
        }
    }
    start(x);
}

public void bishopMove() {
    if (c[p1][p2] == 107 || c[p1][p2] == 75) {
        checkMate();
    } else {
        int t1 = c[m1][m2];
        int t2 = c[p1][p2];
        c[m1][m2] = t2;
        c[p1][p2] = t1;
    }
}

public void bishopCatch(int x, int y) {
    if (c[m1][m2] == 117) {
        if (c[p1][p2] >= 65 && c[p1][2] <= 90) {
            if (c[p1][p2] == 107 || c[p1][p2] == 75) {
                checkMate();
            }
            c[p1][p2] = c[m1][m2];
            c[m1][m2] = 0;
        }
    } else if (c[m1][m2] == 85) {
        if (c[p1][p2] >= 97 && c[p1][p2] <= 90) {
            if (c[p1][p2] == 107 || c[p1][p2] == 75) {
                checkMate();
            }
            c[p1][p2] = c[m1][m2];
            c[m1][m2] = 0;
        }
    }
}
public void bishopCheck() {
    int bm = 0, z = 0;
    if (m1 < p1 && m2 < p2) {
        System.out.println("moving to 1:");
        for (int i = m1 + 1, j = m2 + 1; i <= p1 && j <= p2; i++, j++, z++) {
            if (c[i][j] != 0) {
                bm++;
                bishopCatch(i, j);
            }
        }
        if (c[m1][m2] == c[p1 + z][p2 + z] && bm==1)
            bishopMove();
    } else if (m1 > p1 && m2 > p2) {
        System.out.println("moving to 2:");
        for (int i = m1 - 1, j = m2 - 1; i >= p1 && j >= p2; i--, j--, z++) {
            if (c[i][j] != 0) {
                bm++;
                bishopCatch(i, j);
            }
        }
        if (c[m1][m2] == c[p1 - z][p2 - z] && bm==1)
            bishopMove();
    } else if (m1 < p1 && m2 > p2) {
        System.out.println("moving to 3:");
        for (int i = m1 + 1, j = m2 - 1; i <= p1 && j >= p2; i++, j--, z++) {
            if (c[i][j] != 0) {
                bm++;
                bishopCatch(i, j);
            }
        }
        if (c[m1][m2] == c[p1 + z][p2 - z] && bm==1)
            bishopMove();
    } else if (m1 > p1 && m2 < p2) {
        System.out.println("moving to 4:");
        for (int i = m1 - 1, j = m2 + 1; i >= p1 && j <= p2; i--, j++, z++) {
            if (c[i][j] != 0) {
                bm++;
                bishopCatch(i, j);
            }
        }
        if (c[m1][m2] == c[p1 - z][p2 + z] && bm==1)
            bishopMove();
    }
    start(x);
}

public void queenMove() {
    if (c[p1][p2] == 107 || c[p1][p2] == 75)
        checkMate();
    else if (c[p1][p2] == 0) {
        t1 = c[m1][m2];
        t2 = c[p1][p2];

        c[m1][m2] = t2;
        c[p1][p2] = t1;
    }
}

public void queenCatch(int x, int y) {
    if (c[m1][m2] == 113) {
        if (c[x][y] >= 65 && c[x][y] <= 90) {
            if (c[x][y] == 107 || c[x][y] == 75)
                checkMate();
            c[x][y] = c[m1][m2];
            c[m1][m2] = 0;
        }
    } else if (c[m1][m2] == 81) {
        if (c[x][y] >= 97 && c[x][y] <= 122) {
            if (c[x][y] == 107 || c[x][y] == 75)
                checkMate();
            c[x][y] = c[m1][m2];
            c[m1][m2] = 0;
        }
    }
}
public void queen_check() {
    int qm = 1, z = 0, n = 1;
    boolean truee = false;
    if (m1 < p1 && m2 < p2) {
        for (int i = m1 + 1, j = m2 + 1; i <= p1 && j <= p2; i++, j++, z++) {
            if (c[i][j] != 0) {
                qm = 0;
                queenCatch(i, j);
            }
        }
        if (c[m1][m2] == c[p1 - z][p2 - z] && qm == 1) {
            queenMove();
        }
    } else if (m1 > p1 && m2 > p2) {
        for (int i = m1 - 1, j = m2 - 1, z1 = 0; i >= p1 && j >= p2; i--, j--, z1++) {
            if (c[i][j] != 0) {
                qm = 0;
                queenCatch(i, j);
            }
        }
        if (c[m1][m2] == c[p1 + z][p2 + z] && qm == 1) {
            queenMove();
        }
    } else if (m1 < p1 && m2 > p2) {
        for (int i = m1 + 1, j = m2 - 1, z1 = 0; i <= p1 && j >= p2; i++, j--, z1++) {
            if (c[i][j] != 0) {
                qm = 0;
                queenCatch(i, j);
            }
        }
        if (c[m1][m2] == c[p1 - z][p2 + z] && qm == 1) {
            queenMove();
        }
    } else if (m1 > p1 && m2 < p2) {
        for (int i = m1 - 1, j = m2 + 1, z1 = 0; i >= p1 && j <= p2; i--, j++, z1++) {
            if (c[i][j] != 0) {
                qm = 0;
                queenCatch(i, j);
            }
        }
        if (c[m1][m2] == c[p1 + z][p2 - z] && qm == 1) {
            queenMove();
        }
    }
    if (m2 == p2 || m1 == p1) {
        if (m2 == p2) {
            if (m1 < p1) {
                for (int i = m1 + 1; i <= p1; i++) {
                    if (c[i][m2] != 0) {
                        qm = 0;
                        queenCatch(i, m2);
                    }
                }
            } else if (m1 > p1) {
                for (int i = m1 - 1; i >= p1; i--) {
                    if (c[i][m2] != 0) {
                        qm = 0;
                        queenCatch(i, m2);
                    }
                }
            }
        } else if (m1 == p1) {
            if (m2 < p2) {
                for (int i = m2 + 1; i <= p2; i++) {
                    if (c[m1][i] != 0) {
                        qm = 0;
                        queenCatch(m1, i);
                    }
                }
            } else if (m2 > p2) {
                for (int i = m2 - 1; i >= p2; i--) {
                    if (c[m1][i] != 0) {
                        qm = 0;
                        queenCatch(m1, i);
                    }
                }
            }
        }
        if (qm == 1) {
            queenMove();
        }
    }
    start(x);
}
public void queenCheck() {
    int qm = 1, z = 0;
    if (m1 < p1 && m2 < p2) {
        for (int i = m1 + 1, j = m2 + 1; i <= p1 && j <= p2; i++, j++, z++) {
            if (c[i][j] != 0) {
                qm = 0;
                queenCatch(i, j);
            }
        }
        if (c[m1][m2] == c[p1 - z][p2 - z] && qm==1) {
            queenMove();
        }
    } else if (m1 > p1 && m2 > p2) {
        for (int i = m1 - 1, j = m2 - 1, z1 = 0; i >= p1 && j >= p2; i--, j--, z++) {
            if (c[i][j] != 0) {
                qm = 0;
                queenCatch(i, j);
            }
        }
        if (c[m1][m2] == c[p1 + z][p2 + z] && qm==1) {
            queenMove();
        }
    } else if (m1 < p1 && m2 > p2) {
        for (int i = m1 + 1, j = m2 - 1; i <= p1 && j >= p2; i++, j--, z++) {
            if (c[i][j] != 0) {
                qm = 0;
                queenCatch(i, j);
            }
        }
        if (c[m1][m2] == c[p1 - z][p2 + z] && qm==1) {
            queenMove();
        }
    } else if (m1 > p1 && m2 < p2) {
        for (int i = m1 - 1, j = m2 + 1; i >= p1 && j <= p2; i--, j++, z++) {
            if (c[i][j] != 0) {
                qm = 0;
                queenCatch(i, j);
            }
        }
        if (c[m1][m2] == c[p1 + z][p2 - z] && qm==1) {
            queenMove();
        }
    }
    if (m2 == p2 || m1 == p1) {
        if (m2 == p2) {
            if (m1 < p1) {
                for (int i = m1 + 1; i <= p1; i++) {
                    if (c[i][m2] != 0) {
                        qm = 0;
                        queenCatch(i, m2);
                    }
                }
            } else if (m1 > p1) {
                for (int i = m1 - 1; i >= p1; i--) {
                    if (c[i][m2] != 0) {
                        qm = 0;
                        queenCatch(i, m2);
                    }
                }
            }
        } else if (m1 == p1) {
            if (m2 < p2) {
                for (int i = m2 + 1; i <= p2; i++) {
                    if (c[m1][i] != 0) {
                        qm = 0;
                        queenCatch(m1, i);
                    }
                }
            } else if (m2 > p2) {
                for (int i = m2 - 1; i >= p2; i--) {
                    if (c[m1][i] != 0) {
                        qm = 0;
                        queenCatch(m1, i);
                    }
                }
            }
        }
        if (qm==1) {
            queenMove();
        }
    }
    start(x);
}
public static int cheack() {
    int z = 0, cp = 1;
    System.out.println("\nk1=" + k1 + " k2=" + k2 + " k3=" + k3 + " k4=" + k4);
    if (c[k1][k2] == 75) { // capital king rook cheacks
        for (int i = k2 + 1; i <= 7; i++) { // Right side cheackingpr
            if ((c[k1][i] >= 97 && c[k1][i] <= 122)) {
                if (c[k1][i] == 113 || c[k1][i] == 104) {
                    System.out.println("\nCheack\n");
                    break;
                }
            }
            if (c[k1][i] != 0)
                break;
        }
        for (int i = k2 - 1; i >= 0; i--) { // left side cheacking
            if ((c[k1][i] >= 97 && c[k1][i] <= 122)) {
                if (c[k1][i] == 113 || c[k1][i] == 104) {
                    System.out.println("\nCheack\n");
                    break;
                }
            }
            if (c[k1][i] != 0)
                break;
        }
        for (int i = k1 + 1; i >= 0; i--) { // front side cheacking
            if ((c[i][k2] >= 97 && c[i][k2] <= 122)) {
                if (c[i][k2] == 113 || c[i][k2] ==  104) {
                    System.out.println("\nCheack\n");
                    break;
                }
            }
            if (c[i][k2] != 0)
                break;
        }
        for (int i = k1 - 1; i <= 7; i--) { // back side cheacking
            if ((c[i][k2] >= 97 && c[i][k2] <= 122)) {
                if (c[i][k2] == 113 || c[i][k2] == 104) {
                    System.out.println("\nCheack\n");
                    break;
                }
            }
            if (c[i][k2] != 0)
                break;
        }
    }
    if (c[k3][k4] == 107) { // small king rook cheacks
        for (int i = k4 + 1; i <= 7; i++) { // Right side cheacking
            if ((c[k3][i] >= 65 && c[k3][i] <= 90)) {
                if (c[k3][i] == 81 || c[k3][i] == 72) {
                    System.out.println("\nCheack\n");
                    break;
                }
            }
            if (c[k3][i] != 0)
                break;
        }
        for (int i = k4 - 1; i >= 0; i--) { // left side cheacking
            if ((c[k3][i] >= 65 && c[k3][i] <= 90)) {
                if (c[k3][i] == 81 ||c[k3][i] ==  72) {
                    System.out.println("\nCheack\n");
                    break;
                }
            }
            if (c[k3][i] != 0)
                break;
        }
        for (int i = k3 + 1; i <= 7; i++) { // front side cheacking
            if ((c[i][k4] >= 65 && c[i][k4] <= 90)) {
                if (c[i][k4] ==81 ||c[i][k4] == 72) {
                    System.out.println("\nCheack\n");
                    break;
                }
            }
            if (c[i][k4] != 0)
                break;
        }
        for (int i = k3 - 1; i >= 0; i--) { // back side cheacking
            if ((c[i][k4] >= 65 && c[i][k4] <= 90)) {
                if (c[i][k4] == 81 ||c[i][k4] ==  72) {
                    System.out.println("\nCheack\n");
                    break;
                }
            }
            if (c[i][k4] != 0)
                break;
        }
    }
    return 0;
}
public static void main(String[] args) {
    int[][] pawn = {{1}, {1, 1, 1, 1, 1, 1, 1, 1}};
    int[][] t = {{0}};
    int n = 8, cnt, u = 0;
    int[][] c = new int[8][8];
    for (int i = 0; i < n; i++) {
        c[1][i] = 112;
        c[6][i] = 80;
    }
    c[0][0] = c[0][7] = 104;
    c[0][1] = c[0][6] = 103;
    c[0][2] = c[0][5] = 117;
    c[0][3] = 113;
    c[0][4] = 107;
    c[7][0] = c[7][7] = 72;
    c[7][1] = c[7][6] = 71;
    c[7][2] = c[7][5] = 85;
    c[7][3] = 75;
    c[7][4] = 81;

    start(x);
    while (ch) {
        cheack();
        if (cm == 0)
            return;
        System.out.println("\nEnter position (i&j):");
        Scanner scanner = new Scanner(System.in);
        int m1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        System.out.println("\nEnter moving position (i&j):");
        int p1 = scanner.nextInt();
        int p2 = scanner.nextInt();
        if ((m1 > 7 || m1 < 0) || (m2 > 7 || m2 < 0)) {
            System.out.println("\nEnter valid choice:\n");
        } else {
            if ((c[m1][m2] == 112 || c[m1][m2] == 80)) {
                System.out.println("\nPawn cheack:\n");
                pawn_cheack();
            } else if ((m1 == p1 || m2 == p2) && (c[m1][m2] == 104 || c[m1][m2] == 72)) {
                rook_cheack();
            } else if (c[m1][m2] == 103 || c[m1][m2] == 71) {
                knight_cheack();
            } else if (c[m1][m2] == 107 || c[m1][m2] == 75) {
                king_cheack();
            } else if (c[m1][m2] == 117 || c[m1][m2] == 85) {
                bishop_cheack();
            } else if (c[m1][m2] == 113 || c[m1][m2] == 81) {
                queen_cheack();
            }
        }
    }
}