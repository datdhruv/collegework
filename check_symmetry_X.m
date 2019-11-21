function result = check_symmetry_X(r,angle)
symmetric = 0;
for i = 1:180
    %fprintf('%f\n',angle) %debugging
    if r(i) == r(i) && angle(i) == angle(360-i) %angle = - angle and r = r, condition for symmetrys
        fprintf('%d\n',i);
        symmetric = symmetric + 1;
    %else if r(i) == -r((360-i)) && angle(i) == angle(180-i)
    %        symmetric = symmetric + 1;
    %    end
    end
end
if symmetric == 180
    fprinf('The given function is symmetric about X axis');
end
end