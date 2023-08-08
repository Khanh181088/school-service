#!/bin/bash
echo "rename content of files"
for i in $(find . -name .git -prune -o -type f -name '*.*' ! -name '*.sh');do sed -i '' -e "s/$1/$2/g" $i;done
echo "rename folders"

for k in 1 2 3 4 5 6 7 8 9 10
do
    echo "search in $k depth"
    for i in $(find . -maxdepth "$k" -mindepth "$k" -type d -name "$1*");do mv "$i" "${i//$1/$2}";done
done



#echo 'rename file *******************'
for i in $(find . -type f -name "$1*");do mv "$i" "${i//$1/$2}";done


