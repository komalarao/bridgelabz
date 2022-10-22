for files in `ls *.pdf` ;
do
lhsPdf= echo $files |awk -F. '{print $1}' ;
rhsPdf= echo $files |awk -F. '{print $2}' ;
cd ../../
mkdir -p backup/parent/child/childofchild 
cd 606/main/
mkdir $lhsPdf;
mkdir $rhsPdf;
done


