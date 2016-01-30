function startLoading() {
	$("#loadingDiv").removeClass("hide");
	$("#loadingDiv").addClass("show");
}

function stopLoading() {
	$("#loadingDiv").removeClass("show");
	$("#loadingDiv").addClass("hide");
}