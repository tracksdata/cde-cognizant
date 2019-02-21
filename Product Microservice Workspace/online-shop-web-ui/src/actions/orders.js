

export function createNewOrder(userId, cart) {
    //..
    // let keys = Object.keys(cart);
    // let items = [];
    // let totalAmount = 0.0;
    // keys.forEach(key => {
    //     let itemLine = cart[key];
    //     let item = itemLine.item;
    //     items.push(item);
    //     totalAmount += (item.price * itemLine.qty)
    // })
    // let order = { id: Math.floor(Math.random() * 1000), userId, items: [...items], totalAmount }


    return function (dispatch) {
        fetch('http://localhost:8082/v1/api/orders/praveen', {
            method: 'POST'
        }).then(response => response.json())
            .then(order => {
                dispatch({ type: 'NEW_ORDER', order })
            })
    }


}


export function loadAll(userId, cart) {
    return function (dispatch) {
        fetch('http://localhost:8082/v1/api/orders/praveen')
            .then(response => response.json())
            .then(orders => {
                dispatch({ type: 'LOAD_ORDER', orders })
            })
    }


}