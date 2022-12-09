let turn = true;
let playerTurn = document.getElementById("player-turn");
playerTurn.innerText = "Player " + (turn? "X ": "O ");

function createGame(){
    let table = document.createElement("table");
    for(let i = 0; i < 3; i++){
        let row = table.insertRow();
        for (let j = 0; j < 3; j++) {
            let cell = row.insertCell();
            cell.addEventListener('click', handleClick);
        }
    }
    document.body.appendChild(table);
}

function handleClick(event){
    makeMove(event.target);
    checkWinner();

}

function makeMove(target){
    if (target.innerText == ""){
        if (turn) {
            target.innerText = "X";
        } else {
            target.innerText = "O";
        }
        turn = !turn;
        playerTurn.innerText = "Player " + (turn? "X ": "O ");
    } else {
        alert("Select an empty square.");
    }
}

function checkWinner(){
    let cellArr = document.querySelectorAll("td");
    // 0 1 2
    // 3 4 5
    // 6 7 8
    let arrLetters = []
    for (let cell of cellArr){
        arrLetters.push(cell.innerText);
    }
    
    /**
    012
    345
    678
    036
    147
    259
    048
    246

     */
    let winner = false;
    for(let i = 0; i < 9; i+=3){
        if (arrLetters[i] != "" ){
            if (arrLetters[i] == arrLetters[i+1] && arrLetters[i] == arrLetters[i+2]){
                winner = true;
                alert("Congratulation! You won Player " + ((!turn)? "X ": "O "));
            }
        }
    }

    for (let i = 0; i < 3; i++){
        if (arrLetters[i] != "" ){
            if (arrLetters[i] == arrLetters[i+3] && arrLetters[i] == arrLetters[i+6]){
                winner = true;
                alert("Congratulation! You won Player " + ((!turn)? "X ": "O "));
            }
        }
    }

    if(arrLetters[4] != ""){
        if ((arrLetters[0] == arrLetters[4] && arrLetters[0] == arrLetters[8]) || (arrLetters[2] == arrLetters[4] && arrLetters[2] == arrLetters[6])){
            winner = true;
            alert("Congratulation! You won Player " + ((!turn)? "X ": "O "));
        }
    }

    if (!arrLetters.includes("") && !winner){
        alert("It's a draw");
    }
}

createGame();