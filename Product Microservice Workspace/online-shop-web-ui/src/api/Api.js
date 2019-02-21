
import axios from 'axios'



const Api = {
    addToCart(item, qty) {
        const apiURl = "http://localhost:8081/v1/api/cart/praveen"
        return axios.post(apiURl, { qty, item })
    },
    loadCart(user) {
        const apiURl = "http://localhost:8081/v1/api/cart/praveen"
        return axios.get(apiURl)
    },
    loadProducts(type, size) {
        const apiURl = "http://localhost:8080/v1/api/products";
        return axios.get(apiURl)
    },
    loadReviews(productId, size) {
        const apiURl = "http://localhost:8080/v1/api/products";
        return axios.get(apiURl + `/${productId}/reviews`)
    },
    postReview(productId, review) {
        const apiURl = "http://localhost:8080/v1/api/products";
        return axios
            .post(apiURl + `/${productId}/reviews`, review)
    }

}

export default Api;