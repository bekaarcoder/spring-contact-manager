const ctx = document.getElementById("myPieChart");

let decodedChartData = decodeHtml(chartData)
let jsonData = JSON.parse(decodedChartData);

let labelData = [];
let countData = [];

jsonData.forEach(data => labelData.push(data.label))
jsonData.forEach(data => countData.push(data.count))

console.log(labelData, countData)

const data = {
    labels: labelData,
    datasets: [{
        label: 'Project Status',
        data: countData,
        backgroundColor: [
            'rgb(255, 99, 132)',
            'rgb(54, 162, 235)',
            'rgb(255, 205, 86)'
        ],
        hoverOffset: 4
    }]
};

new Chart(ctx, {
    type: 'pie',
    data: data,
    options: {
        plugins: {
            title: {
                display: true,
                text: 'Project Status'
            }
        }
    }
})

function decodeHtml(html) {
    let txt = document.createElement("textarea");
    txt.innerHTML = html;
    return txt.value;
}