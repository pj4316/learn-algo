const romainMap = new Map<number, string>();
romainMap.set(1000, 'M');
romainMap.set(900, 'CM');
romainMap.set(500, 'D');
romainMap.set(400, 'CD');
romainMap.set(100, 'C');
romainMap.set(90, 'XC');
romainMap.set(50, 'L');
romainMap.set(40, 'XL');
romainMap.set(10, 'X');
romainMap.set(9, 'IX');
romainMap.set(5, 'V');
romainMap.set(4, 'IV');
romainMap.set(1, 'I');

function intToRoman(num: number): string {
    let result = '';
    const nums = [...num.toString()];
    // 1550 -> ['1','5','5','0']
    //           0   1   2   3
    // 
    nums.map((value, index) => {
          const unit = Math.pow(10, nums.length-1-index);
          
          const n = Number.parseInt(value);

          let romain = (romainMap.get(unit * n) ?? '');
          if(romain === '') {
            let over5 = 0;
            if(n>=5) {
                  romain = (romainMap.get(unit*5) ?? '');
                  over5 = 5;
            }
            for(let i =0;i<n-over5;i++) {
                  romain += (romainMap.get(unit) ?? '');
            }
          }

          result += romain;
    })
    return result;
};
