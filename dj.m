theta = 0:0.01:2*pi;
r260 = sin(2*theta).*cos(2*theta);
polarplot(theta,r260);
syms r260(theta)
r260(theta) = sin(2*theta)*cos(2*theta);
R(theta) = diff(r260,theta);
fun(theta) = power((r260^2 + (R(theta))^2),1/2);
L = int(fun,theta,0,2*pi);
L = double(L)
fin(theta) = 0.5*(r260)^2;
A = int(fin,theta,0,2*pi);
A = double(A)
