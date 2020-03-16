import numpy as np

#A = [[1,2,-1],[1,0,1],[4,-4,5]]
#A = [[3,2,4],[2,0,2],[4,2,3]]
#some test cases

A = [[0,0,0],[0,0,0],[0,0,0]]

for i in range(3):
    for j in range (3):
            print("Enter the value of A[",i+1," ",j+1,"] Element")
            A[i][j] = float(input())

B = list(map(list,A))

c0 = -(A[0][0] + A[1][1] + A[2][2])

c1 = (((A[1][1])*(A[2][2]) - (A[1][2])*(A[2][1])) + (A[0][0])*(A[2][2]) - (A[0][2])*(A[2][0])) + ((A[0][0])*(A[1][1]) - (A[0][1])*(A[1][0]))

c2 = -((A[0][0])*((A[1][1])*(A[2][2]) - (A[1][2])*(A[2][1])) - (A[0][1])*((A[1][0])*(A[2][2]) - (A[1][2])*(A[2][0])) + (A[0][2])*((A[1][0])*(A[2][1]) - (A[1][1])*(A[2][0]))) 


print("\nThe Characteristic equation is: x^3 + (",c0,")x^2 +(",c1,")x + (",c2,")\n")

vals = np.roots([1,c0,c1,c2]) #use vals.real here to get only the real values

print("The eigen values are",vals.real,"\n")

my_vals = []
for i in range(len(vals.real)):
    temp = round(vals.real[i])
    temp = temp.astype(int)
    my_vals.append(temp)

def get_eigenVectors(MatA,eigen_val):
    """Input a Matrix and eigen value and find the corresponding eigenvector"""
    EigenVector = []
    check = 0
    MatA[0][0] = MatA[0][0] - eigen_val
    MatA[1][1] = MatA[1][1] - eigen_val
    MatA[2][2] = MatA[2][2] - eigen_val

    if ((MatA[0][0]%MatA[1][0] == 0 and MatA[1][0]%MatA[0][0] == 0) and (MatA[1][1]%MatA[0][1] == 0 and MatA[0][1]%MatA[1][1] == 0) and (MatA[1][2]%MatA[0][2] == 0 and MatA[0][2]%MatA[1][2]==0)):
        print("Row 1 and row 2 are not independant")
    else:
        EigenVector.append(((MatA[0][1])*(MatA[1][2])) - ((MatA[0][2])*(MatA[1][1])))
        EigenVector.append(((MatA[0][2])*(MatA[1][0])) - ((MatA[0][0])*(MatA[1][2])))
        EigenVector.append(((MatA[0][0])*(MatA[1][1])) - ((MatA[0][1])*(MatA[1][0])))
        check = 1
    if check == 0:
        if ((MatA[2][0]%MatA[0][0] == 0 and MatA[0][0]%MatA[2][0] == 0) and (MatA[2][1]%MatA[0][1] == 0 and MatA[0][1]%MatA[2][1] == 0) and (MatA[2][2]%MatA[0][2] == 0 and MatA[0][2]%MatA[2][2]==0)):
            print("Row 2 and 3 are not independent")
        else:
            EigenVector.append(((MatA[1][1])*(MatA[2][2])) - ((MatA[1][2])*(MatA[2][1])))
            EigenVector.append(((MatA[1][2])*(MatA[2][0])) - ((MatA[1][0])*(MatA[2][2])))
            EigenVector.append(((MatA[1][0])*(MatA[2][1])) - ((MatA[1][1])*(MatA[2][0])))
            check = 1

    if check == 0:
        if ((MatA[2][0]%MatA[1][0] == 0 and MatA[1][0]%MatA[2][0] != 0) and (MatA[2][1]%MatA[1][1] == 0 and MatA[1][1]%MatA[2][1] != 0) and (MatA[2][2]%MatA[1][2] == 0 and MatA[1][2]%MatA[2][2]!=0)):
            print("Row  1 and 3 are not independent")
        else:
            EigenVector.append(((MatA[0][1])*(MatA[2][2])) - ((MatA[0][2])*(MatA[2][1])))
            EigenVector.append(((MatA[0][2])*(MatA[2][0])) - ((MatA[0][0])*(MatA[2][2])))
            EigenVector.append(((MatA[0][0])*(MatA[2][1])) - ((MatA[0][1])*(MatA[2][0])))
            check = 1
        if check == 0:
            print("No two rows independent!")


    print("The Eigen vectors are :",EigenVector)

#get_eigenVectors(A,my_vals[0])

for i in range(len(my_vals)):
    print("\n","*"*25,"\n")
    print("For eigenvalue",my_vals[i],":")
    get_eigenVectors(B,my_vals[i])
    B = list(map(list,A))
    
