    var table = document.getElementById("data_list_table");
    var row = table.rows;
    for(var i = 1 ; i < table.rows.length - 1; i++){   
        
        row[i].onmouseover = function(){
            this.style.backgroundColor='ecf5ff';
        }
        
        row[i].onmouseout = function(){
            this.style.backgroundColor='#ffffff';
        }
    }