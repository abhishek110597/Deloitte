

function billAssign(){
var today=new Date();
var lastdate=new Date(2019, 11, 15);

bill=prompt("Enter bill amount")
var day=1000*60*60*24;
x=(today-lastdate)/day
if(x>0)
	{
	bill=parseInt(bill)+parseInt((Math.round(x)*50))
	document.write("Bill="+bill)
	}
else{
	document.write("Bill="+bill)
}
}