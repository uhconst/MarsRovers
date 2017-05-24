var MarsRovers = MarsRovers || {};

/*
 * Mascara para a coordenada Upper-Right
 * Com um espaço entre os números
 */
MarsRovers.MaskUpperRightCoord = (function(){
	function MaskUpperRightCoord(){
		this.inputUpperRightCoor = $('.js-upper-right-coord');
	};
	
	MaskUpperRightCoord.prototype.enable = function(){
		this.inputUpperRightCoor.mask('0 0');
	}
	
	return MaskUpperRightCoord;
}());

/*
 * Mascara para o input da posição do rover
 * Usando regex para aceitar apenas N ou E ou S ou W, e case-insensitive
 */
MarsRovers.MaskRoverPosition = (function(){
	function MaskRoverPosition(){
		this.inputRoverPosition = $('.js-rover-position');
	};
	
	MaskRoverPosition.prototype.enable = function(){
		this.inputRoverPosition.mask('0 0 Z', {
			translation: {
			      'Z': {
			        pattern: /[NESW]/i, optional: false
			      }
			    }
			});
	}
	
	return MaskRoverPosition;
}());


$(function(){
	var maskUpperRightCoord = new MarsRovers.MaskUpperRightCoord();
	maskUpperRightCoord.enable();
	
	var maskRoverPosition = new MarsRovers.MaskRoverPosition();
	maskRoverPosition.enable();
});