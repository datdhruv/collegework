% Create a linearly spaced vector
startValue = 0;
endValue = 2*pi;
nElements = 360;
stepSize = (endValue-startValue)/(nElements-1);
theta = startValue:stepSize:endValue;

r260 = 1-2*sin(3*theta);

polarplot(theta,r260)