


export function ordersReducer(state = [], action) {

    switch (action.type) {
        case 'NEW_ORDER': {
            let { order } = action;
            return [...state, order]
        }
        case 'LOAD_ORDER': {
            let { orders } = action;
            return [...orders]
        }
        default:
            return state;
    }

}