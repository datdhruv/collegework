%theta = linspace(0,2*pi)
startValue = 0;
endValue = 2*pi;
nElements = 360;
stepSize = (endValue-startValue)/(nElements-1);
theta = (startValue:stepSize:endValue);

r260 = sin((-1* theta)/2);
polarplot(theta,r260);

check_symmetry_X(r260,theta);

        
        
