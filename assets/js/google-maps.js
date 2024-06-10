function initMap() {
    // Latitude and Longitude
    var myLatLng = {lat: 24.055308, lng: 82.623105};

    var map = new google.maps.Map(document.getElementById('google-maps'), {
        zoom: 17,
        center: myLatLng
    });

    var marker = new google.maps.Marker({
        position: myLatLng,
        map: map,
        title: 'Madhya Pradesh, India' // Title Location
    });
}