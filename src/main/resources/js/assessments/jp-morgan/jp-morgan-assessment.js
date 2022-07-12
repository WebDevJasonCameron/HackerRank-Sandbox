/** Problem 1
 *
 */

function gameWinner(colors) {

    if(colors.contain != 'www' && colors.length === 2)
        return 'bob'

    if(colors.contain == 'www' && colors.length === 5) {
        return 'windy'
    }
    if(colors.contain == 'bbb' && colors.length === 5) {
        return 'bob'
    }

    let winner = '';
    winner = removeWhite(colors)
    return winner;
}

function removeWhite(col){
    if(col.contain === 'www') {
        col = col.replace('www', 'ww');
        removeBlack(col);
    } else return 'windy';
}

function removeBlack(col){
    if(col.contain === 'bbb') {
        col = col.replace('www', 'ww');
        removeWhite(col);
    } else return 'windy';
}

console.log(gameWinner('wwwbb'));